/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.model;

import lombok.Data;

/**
 * @author wb-yjl790595
 * @version PromotionOutDO.java, v 0.1 2020-08-04 12:03 wb-yjl790595 Exp $$
 */
@Data
public class PromotionOutDO {

    /**
     * 外部活动表ID
     */
    private Integer id;

    /**
     * 活动名称
     */
    private String promotionName;

    /**
     * 活动编号
     */
    private String promotionId;

    /**
     * 活动渠道
     */
    private String channel;

    /**
     * 活动状态
     */
    private String status;

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