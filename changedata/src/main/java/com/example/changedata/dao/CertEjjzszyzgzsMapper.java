package com.example.changedata.dao;

import com.example.changedata.model.CertEjjzszyzgzs;
import com.example.changedata.model.CertEjjzszyzgzsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface CertEjjzszyzgzsMapper {
    long countByExample(CertEjjzszyzgzsExample example);

    int deleteByExample(CertEjjzszyzgzsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CertEjjzszyzgzs record);

    int insertSelective(CertEjjzszyzgzs record);

    List<CertEjjzszyzgzs> selectByExampleWithBLOBs(CertEjjzszyzgzsExample example);

    List<CertEjjzszyzgzs> selectByExample(CertEjjzszyzgzsExample example);

    CertEjjzszyzgzs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CertEjjzszyzgzs record, @Param("example") CertEjjzszyzgzsExample example);

    int updateByExampleWithBLOBs(@Param("record") CertEjjzszyzgzs record, @Param("example") CertEjjzszyzgzsExample example);

    int updateByExample(@Param("record") CertEjjzszyzgzs record, @Param("example") CertEjjzszyzgzsExample example);

    int updateByPrimaryKeySelective(CertEjjzszyzgzs record);

    int updateByPrimaryKeyWithBLOBs(CertEjjzszyzgzs record);

    int updateByPrimaryKey(CertEjjzszyzgzs record);
}