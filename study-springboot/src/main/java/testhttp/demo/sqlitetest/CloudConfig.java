/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest;

import lombok.Data;

/**
 * @author wb-yjl790595
 * @version CloudConfig.java, v 0.1 2020-07-30 15:59 wb-yjl790595 Exp $$
 */

@Data
public class CloudConfig {

    /**
     * 请求网关的appid
     */
    private String appId;

    /**
     * 请求网关的appsecret
     */
    private String appSecret;

    /**
     * 请求网关的token
     */
    private String token;

    /**
     * 网关url
     */
    private String gwUrl;

    /**
     * openapi url
     */
    private String openApiUrl;

    /**
     * 请求open api所需要的client id
     */
    private String clientId;

    /**
     * 请求open api所需要的secret
     */
    private String clientSecret;

    /**
     * 请求open api所需要的client app id
     */
    private String clientAppId;

    /**
     * 请求open api锁需要的token
     */
    private String openApiToken;

    private String test;
}