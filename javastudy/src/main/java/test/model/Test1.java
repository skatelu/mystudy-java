/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package test.model;

/**
 * 类说明
 *
 * @author yjl
 * @version Test1.java, v0.1 2020-09-18 17:16 yjl Exp $$
 */
public enum Test1 {
    /**
     * 只有大类，不区分小类优惠的优惠项通用小类类型
     */
    DAYA_GENERAL_DETAIL(1000, "小类通用类型"),
    /**
     * 会员价
     */
    DAYA_MEMBER_PRICE(1, "会员价"),
    /**
     * 会员折扣
     */
    DAYA_MEMBER_DISCOUNT(2, "会员折扣"),
    /**
     * 兑换券
     */
    DAYA_VOUCHER_EXCHANGE(3, "兑换券"),
    /**
     * 单品折扣券
     */
    DAYA_VOUCHER_ITEM_DISCOUNT(4, "单品折扣券"),
    /**
     * 单品代金券
     */
    DAYA_VOUCHER_ITEM_CASH(5, "单品代金券"),

    /**
     * 全场折扣券
     */
    DAYA_VOUCHER_ORDER_DISCOUNT(6, "全场折扣券"),
    /**
     * 全场代金券
     */
    DAYA_VOUCHER_ORDER_CASH(7, "全场代金券"),
    /**
     * 积分
     */
    DAYA_POINT(8, "积分"),
    /**
     * 储值
     */
    DAYA_BALANCE(9, "储值");

    private int order;
    private String text;

    Test1(int order, String text) {
        this.order = order;
        this.text = text;
    }

    public int getOrder() {
        return this.order;
    }

    public String getText() {
        return this.text;
    }
}
