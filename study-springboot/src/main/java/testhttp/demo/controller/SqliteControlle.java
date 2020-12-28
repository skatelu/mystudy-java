/**
 * Alibaba.com.cn Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import testhttp.demo.service.SqliteService;

/**
 * @author wb-yjl790595
 * @version SqliteControlle.java, v 0.1 2020-07-30 20:01 wb-yjl790595 Exp $$
 */
@RestController
@RequestMapping(value = "/sqlite")
public class SqliteControlle {


    @Autowired
    SqliteService sqliteService;

    @RequestMapping(value = "/testsqlite")
    public String testSqlite() {
        Map<String, List> resultMap = sqliteService.selectAll();

        String result = JSON.toJSONString(resultMap);

        return result;
    }

    @RequestMapping(value = "/querysqlitedo")
    public String querySqliteDO() {

        Map<String, List> stringListMap = sqliteService.querySqliteDO();
        String s = JSON.toJSONString(stringListMap);
        return s;
    }
}