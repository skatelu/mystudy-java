/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.singledesignpattern.case2;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 实战案例二：标识全局唯一类
 * 从业务概念上，如果有些数据在系统中只应保存一份，那就比较适合设计为单例类
 * 唯一递增ID号码生成器
 * @author yjl
 * @version $Id: IdGenerator.java, v 0.1 2021-02-24 16:14 yjl Exp $$
 */
public class IdGenerator {

    private AtomicLong id = new AtomicLong();
    private static final IdGenerator instance = new IdGenerator();

    private IdGenerator(){}

    public static IdGenerator getInstance(){
        return instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }

    public static void main(String[] args) {
        // IdGenerator 使用举例
        long id = IdGenerator.getInstance().getId();
    }
}