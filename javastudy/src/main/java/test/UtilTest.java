/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wb-yjl790595
 * @version UtilTest.java, v 0.1 2020-08-13 10:58 wb-yjl790595 Exp $$
 */
public class UtilTest {


    public static String list = "{\n" +
            "    \"usageRules\": [\n" +
            "        {\n" +
            "            \"ruleType\": \"baseRuleAmount\",\n" +
            "            \"values\": \"0.00\",\n" +
            "            \"operator\": \"GTE\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"superpositionCouponFlag\": false,\n" +
            "    \"expiredDate\": \"2020-08-10\",\n" +
            "    \"membershipId\": 104572647,\n" +
            "    \"cardNo\": \"6201306631509038\",\n" +
            "    \"equityFlag\": false,\n" +
            "    \"merchantId\": 1193521,\n" +
            "    \"useMaxCount\": 0,\n" +
            "    \"dishNo\": \"9de537da-5be5-4d6d-bc41-f56bb2140ad1\",\n" +
            "    \"id\": 1193451386,\n" +
            "    \"beginTime\": \"00:00:00\",\n" +
            "    \"endWeek\": 7,\n" +
            "    \"couponCategoryId\": 7,\n" +
            "    \"startWeek\": 1,\n" +
            "    \"availableQuantity\": 1,\n" +
            "    \"amount\": 0.00,\n" +
            "    \"batchNo\": 1734538,\n" +
            "    \"couponSharingFlag\": false,\n" +
            "    \"sendQuantity\": 1,\n" +
            "    \"mobile\": \"13816388819\",\n" +
            "    \"sendTime\": \"2020-07-22 04:53:18\",\n" +
            "    \"brandId\": 1193521,\n" +
            "    \"couponDateList\": [\n" +
            "        {\n" +
            "            \"startWeek\": 1,\n" +
            "            \"batchNo\": 1734538,\n" +
            "            \"couponWeekUse\": true,\n" +
            "            \"couponTimeUse\": true,\n" +
            "            \"id\": 426532,\n" +
            "            \"beginTime\": \"1970-01-01 00:00:00\",\n" +
            "            \"endTime\": \"1970-01-01 23:59:59\",\n" +
            "            \"endWeek\": 7\n" +
            "        }\n" +
            "    ],\n" +
            "    \"name\": \"生日自制饮料买一送一券\",\n" +
            "    \"isShare\": true,\n" +
            "    \"endTime\": \"23:59:59\",\n" +
            "    \"startDate\": \"2020-07-22\",\n" +
            "    \"status\": 1\n" +
            "}";

    public static void main(String[] args) {
/*
        Coupon coupon = new Coupon();
        coupon.setOverAmount(new BigDecimal(1));
        coupon.setCouponAmount(new BigDecimal(0));
        coupon.setBuyAmount(BigDecimal.ZERO);

        JSONObject thirdCoupon = JSON.parseObject(list);

        BigDecimal cost = thirdCoupon.getBigDecimal("cost") == null ? BigDecimal.ZERO : thirdCoupon.getBigDecimal("cost");

        boolean b = cost.subtract(coupon.getOverAmount()).add(coupon.getCouponAmount())
                .compareTo(coupon.getBuyAmount()) > 0;

        System.out.println(cost);
        */
/*        BigDecimal totalPayAmount = new BigDecimal(100);
        BigDecimal discount = new BigDecimal(0.8);
        BigDecimal discountAmt =
                totalPayAmount.multiply(BigDecimal.ONE.subtract(discount)).setScale(2, RoundingMode.HALF_UP);

        System.out.println(discountAmt);*/


        List<String> test = new ArrayList<>();
        test.add("1");
        test.add("2");
        test.add("3");
        test.add("4");
        test.add("5");

        Iterator<String> iterator = test.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("4")) {
                iterator.remove();
            }
        }

        System.out.println(JSONObject.toJSON(test));

    }

}