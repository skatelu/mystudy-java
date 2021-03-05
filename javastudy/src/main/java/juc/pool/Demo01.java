package juc.pool;

import java.util.concurrent.*;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;

/**
 * 线程池面试相关
 * Executors 工具类 3大方法
 *
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        // 三大方法
//        threeMethod();

        // 7大参数
        test2();
    }

    public static void threeMethod(){
//                ExecutorService threadPool = Executors.newSingleThreadExecutor();// 单个线程
//        ExecutorService threadPool = Executors.newFixedThreadPool(5);// 创建一个固定的线程池大小
        ExecutorService threadPool = Executors.newCachedThreadPool(); // 可伸缩的，遇强则强，遇弱则弱

        try {
            for (int i = 0; i < 100; i++) {
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName()+" -> OK");
                });

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }

    /**
     * 使用原生的 ThreadPoolExecutor 创建线程池
     *
     * 拒绝策略
     * ThreadPoolExecutor.AbortPolicy()   当线程池与队列满了以后，如果还有新的任务进来，就抛出异常
     * ThreadPoolExecutor.CallerRunsPolicy()  哪来的去哪里，即谁调用的线程池谁去处理，此处是main线程去处理了
     * ThreadPoolExecutor.DiscardPolicy()  队列+最大线程数满了，不会抛出异常，但是会丢掉任务
     * ThreadPoolExecutor.DiscardOldestPolicy()  队列+最大线程数满了，尝试去和最早的竞争，如果竞争失败则被抛弃，并且不会返回异常
     */
    public static void test2(){
        // 自定义线程池
        // 最大线程该如何定义？
        // CPU密集型 ：几核就是几，可以保持CPU的效率最高
        // IO密集型 ： 判断你程序中十分耗IO的线程 大于这个线程数就OK了 一般是这个数的2倍
        //         程序中有15个大任务   io十分占用资源！

        // 获取cpu的核数
        int cpus = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(
                5,
                8,
                15,
                 TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(10),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy());
        try {
            for (int i = 0; i < 200; i++) {
                threadPool.execute(()->{
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" -> OK");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }
}
