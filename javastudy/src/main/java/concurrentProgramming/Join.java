/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming;

import java.util.concurrent.TimeUnit;

/**
 * Thread.join() 的使用
 * 创建了个线程，编号-0-9，每一个线程调用前一个线程的join() 方法，也就是线程0结束了，线程1才能从join()方法中返回，而线程0需要等待main线程结束。
 * @author yjl
 * @version $Id: Join.java, v 0.1 2021-01-18 10:18 yjl Exp $$
 */
public class Join {
    public static void main(String[] args) throws InterruptedException {

        Thread previous = Thread.currentThread();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Domino(previous), String.valueOf(i));
            thread.start();
            previous = thread;
        }

        System.out.println("所有线程都在执行中");

        TimeUnit.SECONDS.sleep(5);

        System.out.println(Thread.currentThread().getName() + " terminate");
    }

    static class Domino implements Runnable{

        private Thread thread;

        public Domino(Thread thread) {
            this.thread = thread;
        }

        @Override
        public void run() {
            try {
                // 此处thread只是一个普通对象，调用join方法的线程，是当前正在执行的线程。
                // 如：传入的对象是thread0，但并不是thread0 线程调用的join方法，而是thread1线程调用的join() 方法，thread0在此处只是一个普通对象
                // join() 方法源码中，isAlive()，是thread的native方法，判断是的是传入的线程是否存活
                // join() 方法源码中，wait(0);方法是Object方法，调用该方法的是当前线程对象，这两个方法的调用对象不是同一个对象
                thread.join();
            } catch (InterruptedException e) {

            }
            System.out.println(Thread.currentThread().getName() + " terminate");
        }
    }
}