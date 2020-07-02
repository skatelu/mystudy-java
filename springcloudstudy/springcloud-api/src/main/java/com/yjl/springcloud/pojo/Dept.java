package com.yjl.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 部门实体类
 * 链式写法    支持如次出  dept.setDeptno().setDname()  即支持将 set 方法连起来写
 */
@Data
@NoArgsConstructor // 无参构造器
@Accessors(chain = true)  // 链式写法
public class Dept implements Serializable {

    /**
     * 主键
     */
    private int id;

    /**
     * 部门编号
     */
    private Long deptno;

    /**
     * 部门名称
     */
    private String dname;

    /**
     * 数据库名称
     * 同一个名称可能存在不同的数据库中，次出是用来区分数据库的
     */
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
