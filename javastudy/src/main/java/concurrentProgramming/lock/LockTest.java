/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author yjl
 * @version $Id: LockTest.java, v 0.1 2021-01-20 10:33 yjl Exp $$
 */
public class LockTest {
    private static Lock lock = new ReentrantLock();
    private static int count = 0;
    public static void main(String[] args) {

        for (int i = 0; i < 200; i++) {
            new Thread(new DemoTest(), String.valueOf(i)).start();
        }

    }

    static class DemoTest implements Runnable {

        @Override
        public void run() {
            lock.lock();
            try {
                count = count + 1;
                System.out.println("当前数据和为：" + count);
            } catch (Exception e) {
                System.out.println(e);
            }finally {
                lock.unlock();
            }
        }
    }
}