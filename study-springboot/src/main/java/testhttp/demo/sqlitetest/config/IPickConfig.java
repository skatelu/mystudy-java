/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.config;

/**
 * @author wb-yjl790595
 * @version IPickConfig.java, v 0.1 2020-07-30 16:19 wb-yjl790595 Exp $$
 */

public interface IPickConfig {

    /**
     * 获取门店id
     * @return
     */
    String getStoreId();

    /**
     * 门店编码
     * @return
     */
    String getStoreCode();

    /**
     * 门店名称
     * @return
     */
    String getStoreName();

    /**
     * 商户id
     * @return
     */
    String getTenantId();

    /**
     * 口碑测门店id
     * @return
     */
    String getKbStoreId();

    /**
     * 获取应用标示
     * @return
     */
    String getAppId();

    /**
     * 获取应用密钥
     * @return
     */
    String getAppSecret();

    /**
     * 获取营业日
     * @return
     */
    String getWorkDate();

    /**
     * 获取门店地址
     * @return
     */
    String getStoreAddr();

    /**
     * 获取门店电话
     * @return
     */
    String getStorePhone();
}