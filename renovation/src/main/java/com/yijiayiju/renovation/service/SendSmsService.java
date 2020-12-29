/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.yijiayiju.renovation.service;

import com.yijiayiju.renovation.common.exception.TencentCloudSDKException;
import com.yijiayiju.renovation.request.SendSmsRequest;
import com.yijiayiju.renovation.response.SendSmsResponse;

/**
 * @author yjl
 * @version $Id: sendMsgService.java, v 0.1 2020-12-29 12:23 yjl Exp $$
 */
public interface SendSmsService {
    SendSmsResponse sendSms(SendSmsRequest request) throws TencentCloudSDKException;
}