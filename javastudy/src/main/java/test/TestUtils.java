/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package test;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.ImmutableMap;

/**
 * @author wb-yjl790595
 * @version TestUtils.java, v 0.1 2020-09-10 14:44 wb-yjl790595 Exp $$
 */
public class TestUtils {
    public static void main(String[] args) {

        transToJson();

    }


    public static void transToJson(){
        Map<String, Object> param = new HashMap<>();
        param.put("1", "4");
        param.put("2", "hello");
        param.put("3", ImmutableMap.of(10, "2", 30, "4"));
        Map<Object, Object> test = new HashMap<>();
        test.put(10, "2");
        test.put(30, "4");
        param.put("4", test);
        String s = JSON.toJSONString(param);

        Map map = JSONObject.parseObject(s, Map.class);
        System.out.println(map);

    }
}