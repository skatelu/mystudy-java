/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.model;

import lombok.Data;

/**
 * @author wb-yjl790595
 * @version PromotionOrgDO.java, v 0.1 2020-08-03 15:55 wb-yjl790595 Exp $$
 */
@Data
public class PromotionOrgDO {

    /**
     * 组织表id
     */
    private Integer id;

    /**
     * 活动ID
     */
    private String promotionId;

    /**
     * 活动状态
     */
    private String promotionStatus;

    /**
     * 品牌ID
     */
    private String brandId;

    /**
     * 组织ID
     */
    private String orgId;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 组织类型
     */
    private String orgType;

    /**
     * 活动表达式
     */
    private String promotionExpression;

    /**
     * 创建时间
     */
    private String gmtCreate;

    /**
     * 修改时间
     */
    private String gmtModified;

    /**
     * 扩展字段
     */
    private String extInfo;

}