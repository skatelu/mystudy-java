/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author yjl
 * @version $Id: TestCgLibProxy.java, v 0.1 2020-12-22 9:09 yjl Exp $$
 */
public class TestCgLibProxy {
    public static void main(String[] args) {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TestCgLibProxy.class);
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
                throws Throwable {
                System.out.println("方法执行前。。。。。。");
                Object res = methodProxy.invokeSuper(o, args);
                System.out.println("方法执行后。。。。。。");
                return res;
            }
        });

        TestCgLibProxy proxy = (TestCgLibProxy)enhancer.create();
        proxy.test();
    }

    public void test(){
        System.out.println("Hello world!");
    }
}