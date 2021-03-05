# JDK1.8 线程池源码分析
## 线程池的状态
* 线程池内部使用 AtomicInteger 类型的ctl属性来进行状态控制。其中次高三位分别表示running、shutdown、stop、teminated这5中状态
![](./JAVA线程池状态.png)
## JAVA线程池
* java线程池（ThreadPoolExecutor）大致的一个类图
  ![](./JAVA线程池类图.png)

* 可以看到 ThreadPoolExecutor的父接口有Executor和ExecutorService，其中ExecutorService是对Executor接口的扩展，AbstractExecutorService是ThreadPoolExecutor父类，这个类中也实现了一些非常中药的方法。需要重点分析的还是ThreadPoolExecutorService，我们通常使用如下代码来创建java线程池

* ```java
          ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                  5,
                  8,
                  15,
                   TimeUnit.SECONDS,
                  new LinkedBlockingQueue<>(10),
                  Executors.defaultThreadFactory(),
                  new ThreadPoolExecutor.DiscardOldestPolicy());
  ```



### Executor接口

* 先来看一下顶层接口Executor

* ```java
  public interface Executor {
  
      /**
       * Executes the given command at some time in the future.  The command
       * may execute in a new thread, in a pooled thread, or in the calling
       * thread, at the discretion of the {@code Executor} implementation.
       *
       * @param command the runnable task
       * @throws RejectedExecutionException if this task cannot be
       * accepted for execution
       * @throws NullPointerException if command is null
       */
      void execute(Runnable command);
  }
  ```

* Executor接口里面只有一个execute(Runnable command)抽象方法，是java线程池最核心的方法。返回类型是void，这个方法入参是一个runnable的实例，代表提交一个任务

### ExecutorService接口

* ExecutorService是对Executor接口的扩展，这个接口中提供了更加丰富的功能。我们常用的也是这个接口

* ```java
  public interface ExecutorService extends Executor {
  
      /**
       * 关闭线程池，不再接收新的任务，会继续处理队列中已经添加的任务，不会终止正在执行的任务
       */
      void shutdown();
  
      /**
       * 关闭线程池，不再接收新的任务，但这个方法会停止所有正在执行的任务
       */
      List<Runnable> shutdownNow();
  
      /**
       * 判断线程池是否已经被关闭
       */
      boolean isShutdown();
  
      /**
       * 调用shutdown或者shutdownNow后，如果所有任务都完成了，返回true，否则返回false
       */
      boolean isTerminated();
  
      /**
       * 调用这个方法会等待所有任务完成，并且指定了等待的超时时间，返回是否等待超时
       * 不论是调用shutdown还是shutDownNow，都不会等待任务结束
       * 所以我们应该是先调用shutdown/ShutDownNow。再调用此方法等待所有任务完成
       */
      boolean awaitTermination(long timeout, TimeUnit unit)
          throws InterruptedException;
  
      /**
       * 提交一个任务，不同于execute方法，这里的入参是Callable，并且返回值是Future
       */
      <T> Future<T> submit(Callable<T> task);
  
      /**
       * 提交一个任务，但是这里的任务是runnable
       * runnable执行run后是无返回值的，所以这里传入的result直接作为返回值
       */
      <T> Future<T> submit(Runnable task, T result);
  
      /**
       * 提交一个runnable任务
       */
      Future<?> submit(Runnable task);
  
      /**
       * 执行传入的所有任务
       */
      <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks)
          throws InterruptedException;
  
      /**
       * 执行传入的所有任务，并指定超时时间
       */
      <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks,
                                    long timeout, TimeUnit unit)
          throws InterruptedException;
  
      /**
       * 执行传入的所有任务，只要其中一个任务完成这个方法就可以返回了，返回这个任务的执行结果
       */
      <T> T invokeAny(Collection<? extends Callable<T>> tasks)
          throws InterruptedException, ExecutionException;
  
      /**
       * 同上一个方法，只不过这个方法指定了超时时间
       */
      <T> T invokeAny(Collection<? extends Callable<T>> tasks,
                      long timeout, TimeUnit unit)
          throws InterruptedException, ExecutionException, TimeoutException;
  }
  ```

* 从这里我们可以看到，线程池提交任务的方法有execute和submit，submit和execute最大区别在于submit方法可以获取到线程的执行结果。这里有一个很重要的类：FutureTask。我们下面简单看一个FutureTask的类图

* ![](D:\mystudywork\mystudy-java\javastudy\src\main\java\juc\pool\FutureTask类图.png)

* 我们看到FutureTask实现了**RunnableFuture**，而 RunnableFuture 继承了Tunnable和Future，再来看看FutureTask类中的重要属性和构造方法

* ```java
  
  public class FutureTask<V> implements RunnableFuture<V> {
      /**
       * 当前任务的执行状态，有以下七种，初始状态为NEW
       * NEW -> COMPLETING -> NORMAL
       * NEW -> COMPLETING -> EXCEPTIONAL
       * NEW -> CANCELLED
       * NEW -> INTERRUPTING -> INTERRUPTED
       */
      private volatile int state;
      private static final int NEW          = 0;
      private static final int COMPLETING   = 1;
      private static final int NORMAL       = 2;
      private static final int EXCEPTIONAL  = 3;
      private static final int CANCELLED    = 4;
      private static final int INTERRUPTING = 5;
      private static final int INTERRUPTED  = 6;
   
      /** 这个属性很重要，就是依靠它来执行任务的 */
      private Callable<V> callable;
      /** 调用get时，返回的result*/
      private Object outcome; // non-volatile, protected by state reads/writes
      /** 真正执行callable任务的线程 */
      private volatile Thread runner;
   
      ......
   
      /**
       * 构建一个FutureTask 
       */
      public FutureTask(Callable<V> callable) {
          // NPE检测
          if (callable == null)
              throw new NullPointerException();
          this.callable = callable;
          this.state = NEW;       // ensure visibility of callable
      }
   
      public FutureTask(Runnable runnable, V result) {
          // 这里会把runnable 和 result组装成一个callable对象
          this.callable = Executors.callable(runnable, result);
          this.state = NEW;       // ensure visibility of callable
      }
      ......
  }
  ```

* submit方法之所以可以获取线程执行结果，全依赖与callable和FutureTask，然后调用FutureTask.run()。最终返回FutureTask对象。我们调用FutureTask.get()就可以阻塞获取到线程的执行结果了。