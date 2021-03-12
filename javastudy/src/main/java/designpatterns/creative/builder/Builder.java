/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.builder;

/**
 * 抽象建造者
 * @author yjl
 * @version $Id: Builder.java, v 0.1 2021-03-11 11:27 yjl Exp $$
 */
public abstract class Builder {
    // 地基
    abstract void buildA();

    // 钢筋工程
    abstract void buildB();

    // 铺电线
    abstract void buildC();

    // 粉刷
    abstract void buildD();

    // 完工-获取产品
    abstract Product getProduct();

}