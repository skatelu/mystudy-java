package com.yjl.springcloud.dao;

import com.yjl.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Mapper
@Repository // 用于被Springboot 托管，表示 dao层文件
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept queryById(int id);

    public List<Dept> queryAll();

}
