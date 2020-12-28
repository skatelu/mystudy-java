/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package jdkproxy;

/**
 * @author yjl
 * @version $Id: MyWorkImpl.java, v 0.1 2020-12-22 8:11 yjl Exp $$
 */
public class MyWorkImpl implements MyWork {

    @Override
    public String getWorkName() {
        System.out.println("我的工作名称。。。。。。。。");
        return "程序员";
    }

    @Override
    public String konwWorkContent() {
        System.out.println("我的工作内容。。。。。");
        return "编写程序";
    }
}