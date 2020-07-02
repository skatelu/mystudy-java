package com.example.changedata.service.impl;

import com.example.changedata.dao.SclZhrmghgcjrzAllMapper;
import com.example.changedata.model.SclZhrmghgcjrzAll;
import com.example.changedata.model.SclZhrmghgcjrzAllExample;
import com.example.changedata.service.SclZhrmghgcjrzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SclZhrmghgcjrzServiceImpl implements SclZhrmghgcjrzService {

    @Autowired
    private SclZhrmghgcjrzAllMapper sclZhrmghgcjrzAllMapper;

    @Override
    public List<SclZhrmghgcjrzAll> findSclZhrmghg(Integer begin, Integer end) {
        SclZhrmghgcjrzAllExample example = new SclZhrmghgcjrzAllExample();
        SclZhrmghgcjrzAllExample.Criteria criteria = example.createCriteria();
        criteria.andIdBetween(begin, end);
        List<SclZhrmghgcjrzAll> sclZhrmghgcjrzAlls = sclZhrmghgcjrzAllMapper.selectByExample(example);
        return sclZhrmghgcjrzAlls;
    }

    @Override
    public List<SclZhrmghgcjrzAll> findAll() {
        SclZhrmghgcjrzAllExample example = new SclZhrmghgcjrzAllExample();
        SclZhrmghgcjrzAllExample.Criteria criteria = example.createCriteria();
        criteria.andCertificateholdercodeIsNotNull();
        List<SclZhrmghgcjrzAll> sclZhrmghgcjrzAlls = sclZhrmghgcjrzAllMapper.selectByExample(example);
        return sclZhrmghgcjrzAlls;
    }


}
