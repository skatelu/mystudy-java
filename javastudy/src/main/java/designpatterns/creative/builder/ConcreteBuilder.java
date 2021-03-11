/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.builder;

/**
 * ConcreteBuilder
 * 具体建造者
 * @author yjl
 * @version $Id: ConcreteBuilder.java, v 0.1 2021-03-11 13:50 yjl Exp $$
 */
public class ConcreteBuilder extends Builder {

    private Product product;

    public ConcreteBuilder(){
        product = new Product();
    }

    @Override

    void buildA() {
        product.setBuildA("地基");
    }

    @Override
    void buildB() {
        product.setBuildB("钢筋工程");
    }

    @Override
    void buildC() {
        product.setBuildC("铺电线");
    }

    @Override
    void buildD() {
        product.setBuildD("精装修");
    }

    @Override
    Product getProduct() {
        return product;
    }

}