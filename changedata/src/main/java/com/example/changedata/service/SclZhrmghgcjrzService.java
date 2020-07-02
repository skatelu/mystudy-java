package com.example.changedata.service;

import com.example.changedata.model.SclZhrmghgcjrzAll;

import java.util.List;

public interface SclZhrmghgcjrzService {

    List<SclZhrmghgcjrzAll> findSclZhrmghg(Integer begin, Integer end);

    List<SclZhrmghgcjrzAll> findAll();
}
