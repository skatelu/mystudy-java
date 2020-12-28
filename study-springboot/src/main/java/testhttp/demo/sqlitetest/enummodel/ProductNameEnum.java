/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.enummodel;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author wb-yjl790595
 * @version ProductNameEnum.java, v 0.1 2020-07-30 16:00 wb-yjl790595 Exp $$
 */
@Getter
@AllArgsConstructor
public enum ProductNameEnum {

    CHOICE_PRODUCT("choice", "辰森"),
    ;

    private String code;

    private String desc;

    public static ProductNameEnum getProductNameEnumByCode(String key){
        for (ProductNameEnum productName : values()){
            if (productName.getCode().equals(key)){
                return productName;
            }
        }

        return null;
    }
}