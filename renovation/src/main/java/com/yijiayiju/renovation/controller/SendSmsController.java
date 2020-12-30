/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.yijiayiju.renovation.controller;

import sun.nio.cs.ext.ExtendedCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yijiayiju.renovation.request.SendSmsRequest;
import com.yijiayiju.renovation.response.SendSmsResponse;
import com.yijiayiju.renovation.service.SendSmsService;

/**
 * @author yjl
 * @version $Id: SendSmsController.java, v 0.1 2020-12-29 11:28 yjl Exp $$
 */
@RestController
@RequestMapping("/api/sendMsg")
public class SendSmsController {

    @Autowired
    private SendSmsService sendMsgService;

    @RequestMapping("/sendSms")
    public String sendSms(@RequestBody SendSmsRequest smsRequest) {
        System.out.println("收到请求==================");
        return sendMsgService.sendSms(smsRequest);
    }

}