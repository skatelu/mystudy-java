/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.singledesignpattern.case1;

import java.io.IOException;

/**
 * 单例模式：实战案例1
 * @author yjl
 * @version $Id: OrderController.java, v 0.1 2021-02-24 16:00 yjl Exp $$
 */
public class OrderController {
    public void login(String username, String password) {
        try {
            Logger.getInstance().log(username + "logined!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}