package com.example.changedata.controller;

import com.example.changedata.service.CertSfzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertSfzController {

    @Autowired
    CertSfzService certSfzService;

    @RequestMapping(value = "/getsfz/{sfz}", method = RequestMethod.GET)
    public Object getSfz(@PathVariable String sfz) {
        Object sfzData = certSfzService.getSfzData(sfz);
        return sfzData;
    }

}
