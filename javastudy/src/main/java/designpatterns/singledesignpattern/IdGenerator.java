/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.singledesignpattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式 单例模式
 * @author yjl
 * @version $Id: IdGenerator.java, v 0.1 2021-02-24 16:44 yjl Exp $$
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong();

    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator(){}

    public static IdGenerator getInstance(){
        return instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }
}