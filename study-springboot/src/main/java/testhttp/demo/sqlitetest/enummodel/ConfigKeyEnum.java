/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.enummodel;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wb-yjl790595
 * @version ConfigKeyEnum.java, v 0.1 2020-07-30 15:57 wb-yjl790595 Exp $$
 */

@AllArgsConstructor
@Getter
public enum ConfigKeyEnum {

    CONFIG_STORE_ID("key_store_id", "storeId", "门店ID"),
    CONFIG_STORE_CODE("key_store_code", "storeCode", "门店Code"),
    CONFIG_STORE_NAME("key_store_name", "storeName", "门店名称"),
    CONFIG_STORE_ADDR("key_store_addr", "storeAddr", "门店地址"),
    CONFIG_STORE_PHONE("key_store_phone", "storePhone", "门店电话"),
    CONFIG_TENANT_ID("key_tenant_id", "tenantId", "商户ID"),
    CONFIG_KB_STORE_ID("key_kb_store_id", "kbStoreId", "口碑门店ID"),
    ;

    private String code;

    private String key;

    private String des;

    public static ConfigKeyEnum getConfigEnumByCode(String code){
        for (ConfigKeyEnum key : values()){
            if(key.getCode().equals(code)){
                return key;
            }
        }

        return null;
    }

}