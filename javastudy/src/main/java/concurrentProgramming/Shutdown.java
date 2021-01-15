/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming;

import java.util.concurrent.TimeUnit;

/**
 * 4.2.5 安全的终止线程
 * 在执行过程中，main线程通过中断操作和cancel() 方法均可以使CountRunnerThread得以终止。
 * 这种通过标识位或者中断操作的方式能够使线程在终止时有机会去清理资源，而不是武断地将线程停止，因此这种终止线程的做法显得更加安全和优雅
 * @author yjl
 * @version $Id: Shutdown.java, v 0.1 2021-01-13 11:23 yjl Exp $$
 */
public class Shutdown {

    public static void main(String[] args) throws InterruptedException {
        Thread countRunnerThread = new Thread(new CountRunner(), "CountRunnerThread");
        countRunnerThread.start();

        TimeUnit.SECONDS.sleep(1);
        countRunnerThread.interrupt();

        CountRunner countRunner = new CountRunner();
        Thread countRunnerThread2 = new Thread(countRunner, "CountRunnerThread");
        countRunnerThread2.start();
        TimeUnit.SECONDS.sleep(1);
        countRunner.cancel();

    }

    private static class CountRunner implements Runnable {

        private long i;
        private volatile boolean on = true;



        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count i = " + i);

        }

        public void cancel() {
            on = false;
        }
    }
}