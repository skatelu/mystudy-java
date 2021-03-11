/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.singledesignpattern.case1;

import java.io.IOException;

/**
 * @author yjl
 * @version $Id: UserController.java, v 0.1 2021-02-24 16:00 yjl Exp $$
 */
public class UserController {

    public void login(String username, String password) {
        try {
            Logger.getInstance().log(username + "logined!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}