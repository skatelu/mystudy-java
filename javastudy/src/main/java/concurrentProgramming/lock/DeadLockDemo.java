/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming.lock;

import java.util.concurrent.TimeUnit;

/**
 * 产生死锁代码
 * @author yjl
 * @version $Id: DeadLockDemo.java, v 0.1 2021-03-12 9:47 yjl Exp $$
 */
public class DeadLockDemo {

    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        DeadLockDemo deadLockDemo = new DeadLockDemo();
        deadLockDemo.deadLockTest();

    }

    private void deadLockTest(){

        Thread a = new Thread(() -> {
            synchronized (A) {
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (B) {
                    System.out.println("this is A Thread!");
                }

            }
        }, "A");

        Thread b = new Thread(() -> {
            synchronized (B) {
                synchronized (A) {
                    System.out.println("this is thread B!");
                }
            }
        }, "B");

        a.start();
        b.start();
    }

}