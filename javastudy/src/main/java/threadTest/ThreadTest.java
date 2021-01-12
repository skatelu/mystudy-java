/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package threadTest;

import java.util.concurrent.Callable;

/**
 * @author yjl
 * @version $Id: ThreadTest.java, v 0.1 2021-01-05 14:30 yjl Exp $$
 */
public class ThreadTest {

    public static void main(String[] args) throws Exception {
        Callable<String> taskWork = () -> {
            Thread thread = Thread.currentThread();
            Thread.sleep(3000);
            System.out.println("线程名称" + thread.getName());

            return "执行完成";
        };

        String call = taskWork.call();
        System.out.println("执行完成main");
        Thread.sleep(5000);
        System.out.println(taskWork);
    }
}