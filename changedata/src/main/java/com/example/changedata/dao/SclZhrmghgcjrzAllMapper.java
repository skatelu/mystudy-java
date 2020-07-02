package com.example.changedata.dao;

import com.example.changedata.model.SclZhrmghgcjrzAll;
import com.example.changedata.model.SclZhrmghgcjrzAllExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface SclZhrmghgcjrzAllMapper {
    long countByExample(SclZhrmghgcjrzAllExample example);

    int deleteByExample(SclZhrmghgcjrzAllExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SclZhrmghgcjrzAll record);

    int insertSelective(SclZhrmghgcjrzAll record);

    List<SclZhrmghgcjrzAll> selectByExample(SclZhrmghgcjrzAllExample example);

    SclZhrmghgcjrzAll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SclZhrmghgcjrzAll record, @Param("example") SclZhrmghgcjrzAllExample example);

    int updateByExample(@Param("record") SclZhrmghgcjrzAll record, @Param("example") SclZhrmghgcjrzAllExample example);

    int updateByPrimaryKeySelective(SclZhrmghgcjrzAll record);

    int updateByPrimaryKey(SclZhrmghgcjrzAll record);
}