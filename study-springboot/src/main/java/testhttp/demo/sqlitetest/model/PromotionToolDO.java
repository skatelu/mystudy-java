/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.model;

import lombok.Data;

/**
 * @author wb-yjl790595
 * @version PromotionToolDO.java, v 0.1 2020-08-03 15:57 wb-yjl790595 Exp $$
 */
@Data
public class PromotionToolDO {

    /**
     * 优惠工具表ID
     */
    private Integer id;

    /**
     * 优惠工具code
     */
    private String toolCode;

    /**
     * 优惠工具名称
     */
    private String toolName;

    /**
     * 优惠工具计算类型
     */
    private String calculateType;

    /**
     * 选取优先级，同一个优先级做计算后再选取，不允许跨优先级选取
     */
    private Integer selectedPriority;

    /**
     * 优惠计算接口：不同工具不同接口
     */
    private String calculateCode;

    /**
     * 优惠选取接口:不同优先级不同选取
     */
    private String selectedCode;

    /**
     * 权益类型和计算方法对应关系
     */
    private String benefitMapping;

    /**
     * 状态
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