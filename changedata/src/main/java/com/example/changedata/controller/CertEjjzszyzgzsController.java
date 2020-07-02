package com.example.changedata.controller;

import com.example.changedata.service.CertEjjzszyzgzsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CertEjjzszyzgzsController {
    @Autowired
    private CertEjjzszyzgzsService ejjzszyzgzsService;

//    @RequestMapping(value = "/ejjzs/ownersfzh")
//    public List<String> getOwnerSfzhms() {
//
//        List<String> sfzh = ejjzszyzgzsService.getSfzh();
//
//        return sfzh;
//    }
//
//    @RequestMapping(value = "/ejjzs/topng")
//    public String base64ToPng(){
//        String s = ejjzszyzgzsService.base64ToPng();
//        return s;
//    }
}
