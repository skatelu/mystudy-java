package com.example.changedata.service;

import com.example.changedata.model.CertEjjzszyzgzs;
import com.github.pagehelper.Page;

import java.util.List;

public interface CertEjjzszyzgzsService {

    List<CertEjjzszyzgzs> getEjjzszyzgzs();

    Integer getCount();

    List<String> getSfzh();

    String base64ToPng();

}
