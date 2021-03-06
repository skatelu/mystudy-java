/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yijiayiju.renovation.client;

import java.lang.reflect.Type;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.yijiayiju.renovation.common.AbstractClient;
import com.yijiayiju.renovation.common.Credential;
import com.yijiayiju.renovation.common.exception.TencentCloudSDKException;
import com.yijiayiju.renovation.common.profile.ClientProfile;
import com.yijiayiju.renovation.model.JsonResponseModel;
import com.yijiayiju.renovation.request.QSendSmsRequest;
import com.yijiayiju.renovation.response.SendSmsResponse;

/**
 * @author yjl
 */
public class SmsClient extends AbstractClient {
    private static String endpoint = "sms.tencentcloudapi.com";
    private static String service = "sms";
    private static String version = "2019-07-11";

    public SmsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public SmsClient(Credential credential, String region, ClientProfile profile) {
        super(SmsClient.endpoint, SmsClient.version, credential, region, profile);
    }

    /**
     *短信发送接口，用户给用户发短信验证码、通知类短信或营销短信。
>- 注：由于云 **API3.0 安全性**有所提升，所以**接口鉴权**较为复杂，建议使用 [SDK](https://cloud.tencent.com/document/product/382/43193) 来使用云短信服务。
>- 您可以在 [API 3.0 Explorer](https://console.cloud.tencent.com/api/explorer?Product=sms&Version=2019-07-11&Action=SendSms) 中直接运行该接口，可以先免去签名计算步骤。运行成功后，API Explorer可以**自动生成**SDK代码示例。

     * @param req SendSmsRequest
     * @return SendSmsResponse
     * @throws TencentCloudSDKException
     */
    public SendSmsResponse SendSms(QSendSmsRequest req) throws TencentCloudSDKException {
        JsonResponseModel<SendSmsResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SendSmsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SendSms");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }
}
