/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest;

import testhttp.demo.sqlitetest.enummodel.ConfigKeyEnum;
import testhttp.demo.sqlitetest.enummodel.ModuleEnum;
import testhttp.demo.sqlitetest.enummodel.ProductNameEnum;

/**
 * @author wb-yjl790595
 * @version CommonConfigService.java, v 0.1 2020-07-30 15:54 wb-yjl790595 Exp $$
 */

public interface CommonConfigService {
    /**
     * 根据模块获得数据存放的路径
     *
     * @param model
     * @return
     */
    String getDbPath(ModuleEnum model);

    /**
     * 刷新店铺信息
     */
    void refreshShopInfo();

    /**
     * 获取基础配置，传入需要获取的配置的名称。
     *
     * @param key
     * @return
     */
    String getInfo(ConfigKeyEnum key);

    /**
     * 获取门店的云端配置
     *
     * @return
     */
    CloudConfig getCloudConfig();

    /**
     * 更新gw token
     *
     * @param gwToken
     */
    void updateGwToken(String gwToken);

    /**
     * 更新 open api token
     *
     * @param openApiToken
     */
    void updateOpenApiToken(String openApiToken);

    /**
     * 当前产品的来源名称：辰森，客如云
     *
     * @return
     */
    ProductNameEnum getProductName();

    String getWorkDate();
}