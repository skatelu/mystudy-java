package com.yjl.springcloud.service;

import com.yjl.springcloud.pojo.Dept;

import java.util.List;

public interface DeptService {

    public boolean addDept(Dept dept);

    public Dept queryById(int id);

    public List<Dept> queryAll();

}
