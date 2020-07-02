package com.example.changedata.service.impl;

import com.example.changedata.common.utils.PictureUtils;
import com.example.changedata.dao.CertEjjzszyzgzsMapper;
import com.example.changedata.model.CertEjjzszyzgzs;
import com.example.changedata.model.CertEjjzszyzgzsExample;
import com.example.changedata.service.CertEjjzszyzgzsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CertEjjzszyzgzsServiceImpl implements CertEjjzszyzgzsService {

    @Autowired
    private CertEjjzszyzgzsMapper certEjjzszyzgzsMapper;
    @Override
    public List<CertEjjzszyzgzs> getEjjzszyzgzs() {
        List<String> ownerSfzh = new ArrayList<>();
        CertEjjzszyzgzsExample example = new CertEjjzszyzgzsExample();
        CertEjjzszyzgzsExample.Criteria criteria = example.createCriteria();
        criteria.andOwnersfzhmIn(ownerSfzh);
        List<CertEjjzszyzgzs> certEjjzszyzgzs = certEjjzszyzgzsMapper.selectByExample(example);
        return certEjjzszyzgzs;
    }

    @Override
    public Integer getCount() {
        return null;
    }

    @Override
    public List<String> getSfzh() {
        CertEjjzszyzgzsExample example = new CertEjjzszyzgzsExample();
        CertEjjzszyzgzsExample.Criteria criteria = example.createCriteria();
        criteria.andOwnersfzhmIsNotNull();
        List<CertEjjzszyzgzs> certEjjzszyzgzsList = certEjjzszyzgzsMapper.selectByExample(example);

        List<String> ownerSfzhms = certEjjzszyzgzsList.stream().map(n -> {
            return n.getOwnersfzhm();
        }).collect(Collectors.toList());

        return ownerSfzhms;
    }

    @Override
    public String base64ToPng() {

        CertEjjzszyzgzsExample example = new CertEjjzszyzgzsExample();
        CertEjjzszyzgzsExample.Criteria criteria = example.createCriteria();
        criteria.andOwnersfzhmIsNotNull();
        List<CertEjjzszyzgzs> certEjjzszyzgzs = certEjjzszyzgzsMapper.selectByExample(example);

        for (CertEjjzszyzgzs certEjjzszyzgz : certEjjzszyzgzs) {
            String ofdName = "ejjzszyzgzs" + "_" + certEjjzszyzgz.getCertNumber();
            try {
                PictureUtils.base64ToPng(ofdName, "D:\\图片\\ejjzs", certEjjzszyzgz.getFaceimg());
            } catch (IOException e) {
                System.out.println("转换失败" + certEjjzszyzgz.getId());
            }
        }
        return "转换成功";
    }
}
