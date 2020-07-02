package testhttp.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;

public class TestService {

    public static String a = "{\"certno\":\"证书编号\",\"name\":\"名称\",\"zzbfrq\":\"发证日期\",\"zzyxqjzrq\":\"有效期至\"}";
    public static void test(){
        JSONObject jsonObject = JSONObject.parseObject(a);
        System.out.println(jsonObject.toJSONString());
    }

    public static void main(String[] args) {
        test();
    }
}
