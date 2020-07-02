package testhttp.demo.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import testhttp.demo.common.utils.RestTemplateUtil;
import testhttp.demo.service.CjrService;

@Service
public class CjrServiceImpl implements CjrService {

    @Override
    public String queryAPICertData(String apiurl, String json) {
        JSONObject obj = JSONObject.parseObject(json);
        String cjrzname = obj.getString("name");
        String citizenId = obj.getString("sfzhm");

        String ApiKey = "647434232754339840";
        HttpHeaders headers = new HttpHeaders();
        headers.set("ApiKey",ApiKey);

        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("name",cjrzname);
        params.add("citizenId",citizenId);

        //请求第三方接口地址
        JSONObject jsonObject = RestTemplateUtil.doPost(apiurl, JSONObject.class, headers, params);

        return jsonObject.toString();
    }

}
