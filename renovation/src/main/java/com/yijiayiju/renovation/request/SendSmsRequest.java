/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.yijiayiju.renovation.request;

import java.util.Date;

/**
 * @author yjl
 * @version $Id: SendSmsRequest.java, v 0.1 2020-12-29 11:30 yjl Exp $$
 */
public class SendSmsRequest {
    private String name;

    private String tel;

    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}