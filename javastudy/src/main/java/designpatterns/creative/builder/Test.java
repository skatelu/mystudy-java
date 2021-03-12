/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.builder;

/**
 * @author yjl
 * @version $Id: Test.java, v 0.1 2021-03-11 14:25 yjl Exp $$
 */
public class Test {

    public static void main(String[] args) {
        test2();
    }

    /**
     * 创建精装房
     */
    public static void test1(){
        Director director = new Director();
        Product product = director.create(new ConcreteBuilder());
        System.out.println(product);
    }

    /**
     * 创建毛坯房
     */
    public static void test2(){
        Director director = new Director();
        Product oneHalf = director.createOneHalf(new ConcreteBuilder());
        System.out.println(oneHalf);
    }
}