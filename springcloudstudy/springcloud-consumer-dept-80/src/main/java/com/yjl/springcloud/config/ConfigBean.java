package com.yjl.springcloud.config;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();

        HttpClientConnectionManager manager = new PoolingHttpClientConnectionManager();
        HttpClients.createMinimal(manager);

        HttpClient httpClient = HttpClients.createDefault();

        factory.setConnectTimeout(30);
        factory.setReadTimeout(30);
        factory.setHttpClient(httpClient);

        restTemplate.setRequestFactory(factory);

        return restTemplate;
    }
}
