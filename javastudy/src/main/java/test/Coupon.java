package test;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Coupon {

    /**
     * 优惠券ID
     * 非必填
     */
    private String couponId;

    /**
     * 优惠券名称
     * 非必填
     */
    private String couponName;

    /**
     * 优惠金额
     * 非必填
     */
    private BigDecimal couponAmount;

    /**
     * 购券金额
     * 非必填
     */
    private BigDecimal buyAmount;

    /**
     * 券面金额
     * 非必填
     */
    private BigDecimal couponFaceAmount;

    /**
     * 分摊菜品列表
     * 半角逗号隔开
     * 非必填
     */
    private String dishId;

    /**
     * 超收金额
     */
    private BigDecimal overAmount;

    /**
     * 券类型
     */
    private Integer couponType;

    /**
     * 会员卡ID
     */
    private String cardId;


}