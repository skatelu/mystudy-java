package com.yjl.springcloud.controller;

import com.yjl.springcloud.pojo.Dept;
import com.yjl.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 提供restFull 服务
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/adddept")
    public boolean addDept() {
        Dept dept = new Dept();
        return deptService.addDept(dept);
    }
}
