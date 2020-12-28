/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.enummodel;

import lombok.Getter;

/**
 * @author wb-yjl790595
 * @version DataSourceIdEnum.java, v 0.1 2020-07-30 16:28 wb-yjl790595 Exp $$
 */

public enum DataSourceIdEnum {
    ACTIVITY_DATASOURCE("activityDimension", "门店活动数据源"),
    SCENE_DATASOURCE("sceneDimension", "门店场景数据源"),
    STORE_DATASOURCE("storeDimension", "门店维度数据数据源"),
    TENANT_DATASOURCE("tenantDimension", "商户维度数据源"),
    RECORD_DATASOURCE("test", "基础信息数据源"),
    ;

    @Getter
    private String code;

    @Getter
    private String desc;

    DataSourceIdEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static DataSourceIdEnum getByCode(String code) {
        for (DataSourceIdEnum e : values()) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }
        return null;
    }
}
