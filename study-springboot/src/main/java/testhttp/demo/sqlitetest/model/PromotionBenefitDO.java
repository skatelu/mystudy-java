/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.model;

import lombok.Data;

/**
 * @author wb-yjl790595
 * @version PromotionBenefitDO.java, v 0.1 2020-08-03 15:57 wb-yjl790595 Exp $$
 */
@Data
public class PromotionBenefitDO {

    /**
     * 权益表ID
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
     * 使用范围，菜品Id
     */
    private String coverageItemId;

    /**
     * 优惠权益类型
     */
    private String benefitType;

    /**
     * 优惠权益值
     */
    private String benefitValue;

    /**
     * 权益条件
     */
    private String benefitCondition;

    /**
     * 权益条件类型
     */
//    private String benefitConditionType;

    /**
     * 权益条件值
     */
    private String benefitConditionValue;

    /**
     * 创建时间
     */
    private String gmtCreate;

    /**
     * 更新时间
     */
    private String gmtModified;

    /**
     * 扩展字段
     */
    private String extInfo;
}