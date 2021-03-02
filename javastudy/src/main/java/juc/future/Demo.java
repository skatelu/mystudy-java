package juc.future;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

/**
 * CompletableFuture  Java异步调用
 *
 */
public class Demo {
   private static ThreadPoolExecutor threadPoolExecutor;
   static {
      LinkedBlockingDeque<Runnable> blockingDeque = new LinkedBlockingDeque<>();

      ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("XX-task-%d").build();

      threadPoolExecutor = new ThreadPoolExecutor(2, 5, 20, TimeUnit.SECONDS, blockingDeque,
          threadFactory, new AbortPolicy());
   }

   // 发起一个请求
   public static void main(String[] args) throws ExecutionException, InterruptedException {

      TestScheduledThreadPoolExecutor();
      //TestThreadPoolExecutor();
   }

   public static void TestScheduledThreadPoolExecutor() throws ExecutionException, InterruptedException {
      FutureTask<String> callableFutureTask = new FutureTask<String>(new TaskJob());
      Future<?> submit = threadPoolExecutor.submit(callableFutureTask);
      //StringBuffer stringBuffer = submit.get();
      //System.out.println(stringBuffer.toString());
      threadPoolExecutor.shutdown();
   }

   public static void TestThreadPoolExecutor() throws ExecutionException, InterruptedException {

      TaskJob taskJob = new TaskJob();

      Future<String> future = threadPoolExecutor.submit(taskJob);

      String s = null;
      s = future.get();

      System.out.println(s);

      threadPoolExecutor.shutdown();
   }
}
