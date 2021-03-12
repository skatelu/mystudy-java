/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.singledesignpattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * @author yjl
 * @version $Id: PracticeSingleton.java, v 0.1 2021-03-10 10:51 yjl Exp $$
 */
public class PracticeSingleton {

    private static AtomicLong id = new AtomicLong();

    private PracticeSingleton(){}

    private static class SingletonHolder {
        private static final PracticeSingleton instance = new PracticeSingleton();
    }

    public static PracticeSingleton getInstance(){
        return SingletonHolder.instance;
    }

    public static Long getId(){
        return id.incrementAndGet();
    }
}