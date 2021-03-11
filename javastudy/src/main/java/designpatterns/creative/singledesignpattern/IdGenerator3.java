/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.singledesignpattern;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 单例模式-枚举单例
 * 通过java枚举类型本身的特性
 *
 * @author yjl
 * @version $Id: IdGenerator3.java, v 0.1 2021-02-24 18:02 yjl Exp $$
 */
public enum IdGenerator3 {

    INSTANCE,
    ;
    private AtomicLong id = new AtomicLong();

    public Long getId(){
        return id.incrementAndGet();
    }

}