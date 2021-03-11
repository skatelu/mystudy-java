/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.builder;

/**
 * 指挥者
 * 将具体创建者以参数的形式传入，根据生产的产品不同，调用具体创建者不同的方法，产生不同类型的产品
 * @author yjl
 * @version $Id: Director.java, v 0.1 2021-03-11 14:23 yjl Exp $$
 */
public class Director {
    // 指挥工人按顺序造房

    /**
     * 创造精装房
     * @param builder
     * @return
     */
    public Product create(Builder builder) {
        builder.buildA();
        builder.buildB();
        builder.buildC();
        builder.buildD();
        return builder.getProduct();
    }

    /**
     * 创建毛坯房
     * @param builder
     * @return
     */
    public Product createOneHalf(Builder builder) {

        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getProduct();
    }
}