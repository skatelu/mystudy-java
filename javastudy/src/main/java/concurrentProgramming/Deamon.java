/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming;

import java.util.concurrent.TimeUnit;

/**
 * Deamon 守护线程特性
 * Deamon 线程被用作完成支持工作，但是在java虚拟机退出时Deamon线程中的finally块 并不一定执行。
 * 以下是示例代码
 * @author yjl
 * @version $Id: Deamon.java, v 0.1 2021-01-12 15:28 yjl Exp $$
 */
public class Deamon {
    public static void main(String[] args) {
        Thread deamonRunner = new Thread(new DeamonRunner(), "DeamonRunner");
        deamonRunner.setDaemon(true);
        deamonRunner.start();
    }

    static class DeamonRunner implements Runnable{

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("DeamonThread finally run.");
            }
        }
    }
}