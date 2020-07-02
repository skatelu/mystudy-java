package com.example.changedata.dao;

import com.example.changedata.model.CertCjrz;
import com.example.changedata.model.CertCjrzExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface CertCjrzMapper {
    long countByExample(CertCjrzExample example);

    int deleteByExample(CertCjrzExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CertCjrz record);

    int insertSelective(CertCjrz record);

    List<CertCjrz> selectByExampleWithBLOBs(CertCjrzExample example);

    List<CertCjrz> selectByExample(CertCjrzExample example);

    CertCjrz selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CertCjrz record, @Param("example") CertCjrzExample example);

    int updateByExampleWithBLOBs(@Param("record") CertCjrz record, @Param("example") CertCjrzExample example);

    int updateByExample(@Param("record") CertCjrz record, @Param("example") CertCjrzExample example);

    int updateByPrimaryKeySelective(CertCjrz record);

    int updateByPrimaryKeyWithBLOBs(CertCjrz record);

    int updateByPrimaryKey(CertCjrz record);
}