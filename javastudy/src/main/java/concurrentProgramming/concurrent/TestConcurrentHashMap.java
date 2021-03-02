/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/**
 * 在多线程环境下，使用HashMap进行put操作会引起死循环
 * @author yjl
 * @version $Id: TestConcurrentHashMap.java, v 0.1 2021-01-27 16:51 yjl Exp $$
 */
public class TestConcurrentHashMap {

    private static final Map<String, String> map = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch = new CountDownLatch(1);

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                new Thread(() -> {
                    map.put(UUID.randomUUID().toString(), "");
                }, "ftf" + i).start();
            }
            countDownLatch.countDown();
        }, "ftf");

        thread.start();
        countDownLatch.await();
    }

}