/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package testhttp.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import testhttp.demo.aspect.DoneTime;

/**
 * 测试 Aop切面
 *
 * @author yjl
 * @version $Id: AopController.java, v 0.1 2020-12-28 9:29 yjl Exp $$
 */
@RestController
@RequestMapping("/aopTest")
public class AopController {

    @GetMapping("/logAspect")
    public String aopTest() {
        System.out.println("方法执行在执行中。。。");
        return "成功";
    }

    @GetMapping("/doneTimeAspect")
    @DoneTime(param = "aopTestDoneTime")
    public String aopTestDoneTime(String name) {
        System.out.println("利用自定义注解使用切面");
        System.out.println("方法执行中。。。。。。");
        return "成功！！！";
    }

}