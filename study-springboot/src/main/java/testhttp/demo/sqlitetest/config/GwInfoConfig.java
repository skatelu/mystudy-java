/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.config;

/**
 * @author wb-yjl790595
 * @version GwInfoConfig.java, v 0.1 2020-07-30 16:23 wb-yjl790595 Exp $$
 */

public interface GwInfoConfig {

    /**
     * 请求网络需要的AppId
     *
     * @return
     */
    String getAppId();

    /**
     * 请求网络需要用到的secret.
     * @return
     */
    String getAppSecret();

    /**
     * 请求网络需要用到的token
     *
     * @return
     */
    String getToken();

    /**
     * 刷新辰森的tonken
     *
     * @param token 刷新后的token
     */
    void refreshToken(String token);

    /**
     * open api 的client id
     * @return
     */
    String getClientId();

    /**
     * Open api 的client srcret
     * @return
     */
    String getClientSecret();

    /**
     * open api的appid
     * @return
     */
    String getClientAppId();

    /**
     * open api的token
     * @return
     */
    String getOpenAipToken();

    /**
     * 网关url
     *
     * @return
     */
    String getGwUrl();

    /**
     * open api url
     * @return
     */
    String getOpenApiUrl();
}