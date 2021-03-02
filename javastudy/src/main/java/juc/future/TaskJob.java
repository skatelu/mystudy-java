/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package juc.future;

import java.util.concurrent.Callable;

/**
 * @author yjl
 * @version $Id: TaskJob.java, v 0.1 2021-02-20 10:30 yjl Exp $$
 */
public class TaskJob implements Callable<String> {

    @Override
    public String call() throws Exception {
        System.out.println("Hello World!");

        return "Hello World!";
    }
}