/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.model;

import lombok.Data;

/**
 * @author wb-yjl790595
 * @version PromotionBaseDO.java, v 0.1 2020-08-03 15:57 wb-yjl790595 Exp $$
 */
@Data
public class PromotionBaseDO {

    /**
     * 活动基本信息表ID
     */
    private Integer id;

    /**
     * 活动ID
     */
    private String promotionId;

    /**
     * 品牌ID
     */
    private String brandId;

    /**
     * 活动类型
     */
    private String promotionType;

    /**
     * 活动名称
     */
    private String promotionName;

    /**
     * 活动描述
     */
    private String description;

    /**
     * 活动开始时间
     */
    private String startTime;

    /**
     * 活动结束时间
     */
    private String endTime;

    /**
     * 是否是优惠券
     */
    private Integer beVoucher;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 是否可叠加 0-否；1-是
     */
    private Integer beOverlay;

    /**
     * 可叠加次数
     */
    private Integer overlayTimes;

    /**
     * 是否自动执行
     */
    private Integer beAutoActive;

    /**
     * 是否可见
     */
    private Integer beVisible;

    /**
     * 可用时间
     */
    private String availableTime;

    /**
     * 商品适用范围
     */
    private String itemCoverage;

    /**
     * 适用人群
     */
    private String suitablePeople;

    /**
     * 工具code
     */
    private String promotionToolCode;

    /**
     * 状态
     */
    private String status;

    /**
     * 外部促销活动ID
     */
    private String outPromotionId;

    /**
     * 是否删除:0-否；1-是
     */
    private Integer deleted;

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