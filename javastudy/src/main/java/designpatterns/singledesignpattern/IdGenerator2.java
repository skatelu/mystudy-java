/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.singledesignpattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * java 单例模式-静态内部类
 * SingletonHolder 是一个内部静态类，当外部类IdGenerator被加载的时候，并不会创建 SingletonHolder 实例对象。
 * 只有当调用 getInstance() 方法时，SingletonHolder 才会被加载，这个时候才会创建 instance。
 * instace的唯一性、创建过程的线程安全性，都由JVM来保证。
 * @author yjl
 * @version $Id: IdGenerator2.java, v 0.1 2021-02-24 17:35 yjl Exp $$
 */
public class IdGenerator2 {

    private AtomicLong id = new AtomicLong();

    private IdGenerator2(){

    }

    private static class SingletonHolder{
        private static final IdGenerator2 instance = new IdGenerator2();
    }

    public static IdGenerator2 getInstance(){
        return SingletonHolder.instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }
}