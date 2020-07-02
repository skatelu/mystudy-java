package testhttp.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import testhttp.demo.service.CjrService;

@RestController
public class CjrController {

    @Autowired
    private CjrService cjrService;

    @RequestMapping(value = "getCjrz", method = RequestMethod.POST)
    public String queryACertData(@RequestBody JSONObject jsonParam){

        String s = cjrService.queryAPICertData("http://59.206.202.180:443/gateway/api/1/sdcl_xxzx_czcjr", jsonParam.toJSONString());

        return s;
    }
}
