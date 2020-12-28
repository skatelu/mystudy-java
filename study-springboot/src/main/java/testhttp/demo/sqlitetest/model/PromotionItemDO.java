/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.sqlitetest.model;

import lombok.Data;

/**
 * @author wb-yjl790595
 * @version PromotionItemDO.java, v 0.1 2020-08-03 15:56 wb-yjl790595 Exp $$
 */
@Data
public class PromotionItemDO {

    /**
     * 商品(菜品)表ID
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
     * 商品ID
     */
    private String itemId;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 商品类型
     */
    private String itemType;

    /**
     * 商品价格
     */
    private Long itemPrice;

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