package com.example.changedata.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.changedata.common.utils.RestTemplateUtil;
import com.example.changedata.model.CertCjrz;
import com.example.changedata.service.CjrService;
import com.example.changedata.service.impl.SclZhrmghgcjrzServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

@RestController
public class CjrController {

    @Autowired
    private CjrService cjrService;

    @RequestMapping(value = "/test")
    public String saveCjr() {
        CertCjrz certCjrz = new CertCjrz();
        int i = cjrService.saveCjrz(certCjrz);
        if (i != 0) {
            return "保存成功";
        }
        return "保存失败";
    }

    @RequestMapping(value = "/getCjrz", method = RequestMethod.GET)
    public String queryACertData() {

        String result = cjrService.queryAPICertData("http://10.210.2.199:20002/getCjrz");
//        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
//        JSONObject jsonObject = RestTemplateUtil.doPost("http://localhost:8081/test", JSONObject.class, params);

        return result;
    }

}
