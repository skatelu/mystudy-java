/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package jdkproxy;

import java.lang.reflect.Proxy;

/**
 * @author yjl
 * @version $Id: TestJdkProxy.java, v 0.1 2020-12-22 8:09 yjl Exp $$
 */
public class TestJdkProxy {

    public static void main(String[] args) {

        Class[] interfaces = {MyWork.class};

        MyWorkImpl myWork = new MyWorkImpl();

        MyWork myWork1 = (MyWork)Proxy.newProxyInstance(TestJdkProxy.class.getClassLoader(), interfaces,
            new ExtendMethod(myWork));
        String s = myWork1.konwWorkContent();
        String workName = myWork1.getWorkName();

        System.out.println(workName + s);

    }
}