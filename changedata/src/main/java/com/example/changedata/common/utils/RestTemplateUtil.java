package com.example.changedata.common.utils;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Slf4j(topic = "http")
public class RestTemplateUtil {
    //默认http请求读取时间
    public static Integer DEFAULT_HTTP_READ_TIMEOUT = 30000;
    //默认http请求连接时间
    public static Integer DEFAULT_HTTP_CONNECT_TIMEOUT = 60000;

    private static RestTemplate restTemplate;

    static {
        restTemplate = new RestTemplate();
//        restTemplate.getInterceptors().add(new MyHttpInterceptor());
    }

    public static ResponseEntity<String> doPost(String url, HttpHeaders httpHeaders, MultiValueMap<String, Object> params) {
        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(params, httpHeaders);
        log.info("post调用{}", url);
        ResponseEntity<String> stringResponseEntity = restTemplate.postForEntity(url, requestEntity, String.class);
        return stringResponseEntity;
    }

//    public static <T> T doPost(String url, Class<T> t, MultiValueMap<String, Object> params) {
//        log.info("post调用{}", url);
//        return doPost(url, t, new HttpHeaders(), params);
//    }
}