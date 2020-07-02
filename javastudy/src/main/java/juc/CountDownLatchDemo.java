package juc;

import java.util.concurrent.*;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        // 减法计数器
//        countDownLatchTest();

        // 加法计数器
//        cyclicBarrierTest();

        /**
         * 应用场景  停车位  限流
         */
        semaphoreTest();

    }

    /**
     * 线程 减法计数器 目的是为了 当所有线程都执行完毕后，再去执行下一步骤
     * @throws InterruptedException
     */
    public static void countDownLatchTest() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);

        for (int i = 0; i < 6; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "Go Out");
                countDownLatch.countDown();// 数量减一
            }).start();
        }

        countDownLatch.await();

        System.out.println("Close Door");
    }

    /**
     * 线程 加法计数器 目的是为了 执行到第几个线程时，再去执行下一步骤
     */
    public static void cyclicBarrierTest(){
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, () -> {
            System.out.println("召唤神龙成功");
        });

        for (int i = 0; i < 7; i++) {
            // lambda 能操作i么？
            int temp = i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + "收集" + temp + "个龙珠");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }

    /**
     *
     */
    public static void semaphoreTest(){
        Semaphore semaphore = new Semaphore(3);

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "抢到车位");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName() + "离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }

            }, i+"").start();
        }
    }
}
