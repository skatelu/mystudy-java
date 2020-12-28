/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.enummodel;

import lombok.Getter;

/**
 * @author wb-yjl790595
 * @version ModuleEnum.java, v 0.1 2020-07-30 15:56 wb-yjl790595 Exp $$
 */
public enum ModuleEnum {

    COMMON("COMMON", "common", "com.alsc.pos.common", "通用模块"),
    DISH("DISH", "dish", "com.alsc.dish", "菜品模块"),
    BASE_DATA("BASE_DATA", "test", "com.alsc.basedata", "基础数据模块"),
    ORDER("ORDER", "common", "com.alsc.order", "订单模块"),
    CART("CART", "common", "com.alsc.cart", "购物车模块"),
    FULL_FILL("FULL_FILL", "common", "com.alsc.fullfill", "履约模块"),
    CRM("CRM", "crm", "com.alsc.crm", "会员模块"),
    ROUTER("ROUTER", "common", "com.alsc.pos.router", "路由模块"),
            ;

    @Getter
    private String name;

    @Getter
    private String desc;

    @Getter
    private String dbPath;

    @Getter
    private String packageName;

    ModuleEnum(String name, String dbPath,  String packageName, String des){
        this.name = name;
        this.dbPath = dbPath;
        this.desc = des;
        this.packageName = packageName;
    }
}