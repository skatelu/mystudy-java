/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package concurrentProgramming.productmodel;

import java.util.concurrent.atomic.AtomicInteger;

import org.checkerframework.checker.units.qual.A;

/**
 * 单线程模式下的生产消费者模式
 * 使用synchronize wait notify/notifyall 实现生产者消费者模式
 * @author yjl
 * @version $Id: productModel.java, v 0.1 2021-02-20 16:10 yjl Exp $$
 */
public class TestProductModel {

    public static AtomicInteger atomicInteger = new AtomicInteger();
    public volatile boolean flag = false;

}