/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;

/**
 * @author yjl
 * @version $Id: ExtendMethod.java, v 0.1 2020-12-22 8:15 yjl Exp $$
 */
public class ExtendMethod implements InvocationHandler {

    private Object obj;

    public ExtendMethod(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行方法之前。。。。。。");

        if (StringUtils.equals(method.getName(), "konwWorkContent")) {
            System.out.println("编写程序时，我觉得很愉快，很轻松！");
        }
        // 代理对象执行的方法
        Object res = method.invoke(obj, args);

        System.out.println("开始执行方法之后。。。。。。");
        return res;
    }
}