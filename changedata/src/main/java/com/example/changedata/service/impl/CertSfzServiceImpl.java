package com.example.changedata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.changedata.common.utils.HttpUtils;
import com.example.changedata.common.utils.RSAUtil;
import com.example.changedata.service.CertSfzService;
import org.springframework.stereotype.Service;

import java.security.interfaces.RSAPublicKey;
import java.time.Instant;

@Service
public class CertSfzServiceImpl implements CertSfzService {

    @Override
    public Object getSfzData(String sfzh) {
        // 获取当前时间的long值
        long epochSecond = Instant.now().toEpochMilli();
        String content = sfzh + "&" + epochSecond;
        RSAPublicKey publicKey = RSAUtil.getPublicKey();
        String s = RSAUtil.encryptByPublic(content.getBytes(), publicKey);
        String param = "gmsfhm=" + s;
        String s1 = HttpUtils.sendPostSfz("http://172.20.224.3:12580/api/personDataOut", param);
        JSONObject jsonObject = JSONObject.parseObject(s1);
        System.out.println(jsonObject);
        return jsonObject;
    }

}
