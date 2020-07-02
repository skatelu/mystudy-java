package com.yjl.springcloud.controller;

import com.yjl.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Controller
public class DeptConsumerController {

    /**
     * SpringBoot 支持Restfull 请求方式
     * RestTemplate 。。。 供我们直接调用！ 需要注册到Spring中
     *
     */
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @GetMapping("/consumer/dept/get/{id}")
    Object getDept(@PathVariable("id") int id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get" + id, Dept.class);
    }

}
