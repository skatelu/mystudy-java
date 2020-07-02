package testhttp.demo.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Slf4j(topic = "http")
public class RestTemplateUtil {
    //默认http请求读取时间
    public static Integer DEFAULT_HTTP_READ_TIMEOUT = 30000;
    //默认http请求连接时间
    public static Integer DEFAULT_HTTP_CONNECT_TIMEOUT = 60000;

    private static RestTemplate restTemplate;

    static {
        restTemplate = new RestTemplate();
        SimpleClientHttpRequestFactory simpleClientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        simpleClientHttpRequestFactory.setReadTimeout(DEFAULT_HTTP_READ_TIMEOUT);
        simpleClientHttpRequestFactory.setConnectTimeout(DEFAULT_HTTP_CONNECT_TIMEOUT);
        restTemplate.setRequestFactory(simpleClientHttpRequestFactory);
        restTemplate.getMessageConverters().clear();
        restTemplate.getMessageConverters().add(new FormHttpMessageConverter());
        restTemplate.getMessageConverters().add(new GsonHttpMessageConverter());
//        restTemplate.getInterceptors().add(new MyHttpInterceptor());
    }

    public static <T> T doPost(String url, Class<T> t, HttpHeaders httpHeaders, MultiValueMap<String, Object> params) {
        HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(params, httpHeaders);
        log.info("post调用{}", url);
        return restTemplate.exchange(url, HttpMethod.POST, requestEntity, t).getBody();
    }

    public static <T> T doPost(String url, Class<T> t, MultiValueMap<String, Object> params) {
        log.info("post调用{}", url);
        return doPost(url, t, new HttpHeaders(), params);
    }

    public static void main(String[] args) {

        String a = "{\"name\":\"{\\\"name\\\":\\\"姓名\\\", \\\"valueType\\\":\\\"String\\\",\\\"columnName\\\":\\\"KZ_XM\\\"}\",\n" +
                "\"sex\":\"{\\\"name\\\":\\\"性别\\\",\\\"valueType\\\":\\\"String\\\",\\\"columnName\\\":\\\"KZ_XB\\\"}\",\n" +
                "\"ownersfzhm\":\"{\\\"name\\\":\\\"身份证件号码\\\",\\\"valueType\\\":\\\"String\\\",\\\"columnName\\\":\\\"KZ_SFZHM\\\"}\",\n" +
                "\"category\":\"{\\\"name\\\":\\\"专业类别\\\",\\\"valueType\\\":\\\"String\\\",\\\"columnName\\\":\\\"KZ_ZYLB\\\"}\",\n" +
                "\"pzrq\":\"{\\\"name\\\":\\\"批准日期\\\",\\\"valueType\\\":\\\"String\\\",\\\"columnName\\\":\\\"KZ_PZRQ\\\"}\"}";
        String b = "";
        Map<String, String> map = JSONObject.parseObject(a, Map.class);
        String s = JSON.toJSONString(map);
        System.out.println(s);
        Gson gson = new Gson();
        Map map1 = gson.fromJson(a, Map.class);
        System.out.println(map1);

    }
}