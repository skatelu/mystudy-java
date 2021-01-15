/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

/**
 * 4.2.3 理解中断
 * 首先创建两个线程，SleepThread 和 BusyThread，前者不停的睡眠，后者一直运行
 * 从结果可以看出，抛出 InterruptedException 的线程SleepRunnerThread ，其中断标识被清除了，而一直忙碌运作的线程 BusyRunnerThread，中断标识没有被清除
 * 在java API 中可以看到，许多声明抛出 InterruptedException （例如Thread.sleep(long
 * millis)方法），这些方法在抛出 InterruptedException 之前，java虚拟机会先将该线程的中断标识位清除，然后抛出 InterruptedException ，此时调用 isInterrupted() 方法将会返回false
 *
 * @author yjl
 * @version $Id: Interrupted.java, v 0.1 2021-01-13 10:05 yjl Exp $$
 */
public class Interrupted {

    public static void main(String[] args) throws InterruptedException {
        // SleepRunnerThread 不停的尝试睡眠
        Thread sleepRunnerThread = new Thread(new SleepRunner(), "SleepRunnerThread");
        sleepRunnerThread.setDaemon(true);

        // BusyRunnerThread 不停的运行
        Thread busyRunnerThread = new Thread(new BusyRunner(), "BusyRunnerThread");
        busyRunnerThread.setDaemon(true);
        sleepRunnerThread.start();
        busyRunnerThread.start();
        // 休眠5秒，让SleepRunnerThread、BusyRunnerThread 充分的进行运行
        TimeUnit.SECONDS.sleep(1);
        sleepRunnerThread.interrupt();
        busyRunnerThread.interrupt();

        System.out.println("SleepThread interrupted is " + sleepRunnerThread.isInterrupted());
        System.out.println("BusyThread interrupted is " + busyRunnerThread.isInterrupted());
        // 休眠2秒，防止sleepRunnerThread 和 BusyRunnerThread 立刻退出
        TimeUnit.SECONDS.sleep(2);
        System.out.println("程序执行完成=========");
        TimeUnit.SECONDS.sleep(1);
    }


    static class SleepRunner implements Runnable {

        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class BusyRunner implements Runnable {

        @Override
        public void run() {
            while (true){
                for (int i = 0; i < 100000; i++) {
                    if (i == 99999) {
                        System.out.println("BusyRunnerThread,正在输出。。。。。。。");
                    }
                }
            }
        }
    }

}