/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package java8.hashmap;

import java.util.HashMap;

/** 学习 HashMap 源码使用
 * @author yjl
 * @version $Id: HashMapStudy.java, v 0.1 2021-03-09 10:13 yjl Exp $$
 */
public class HashMapStudy {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        String test = map.put("1", "test");
    }

}