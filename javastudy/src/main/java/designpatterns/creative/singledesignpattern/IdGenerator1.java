/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.singledesignpattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 双重检测模式 单例模式
 * @author yjl
 * @version $Id: IdGenerator1.java, v 0.1 2021-02-24 17:11 yjl Exp $$
 */
public class IdGenerator1 {

    private AtomicLong id = new AtomicLong();

    private static volatile IdGenerator1 instance;

    private IdGenerator1(){ }

    public static IdGenerator1 getInstance(){
        if (instance == null) {
            synchronized (IdGenerator1.class){
                if (instance == null) {
                    instance = new IdGenerator1();
                }
            }
        }
        return instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }

}