package com.yjl.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    //配置负载均衡实现 RestTemplate
    // LoadBalanced 关键接口 IRUle
    // AvailabilityFilteringRule : 它会先过滤，跳闸，访问故障的服务，对剩下的进行轮询
    // RetryRule ：会先按照轮询获取服务，如果服务获取失败，则会在指定的时间内进行重试
    //
    @Bean
    @LoadBalanced
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

    @Bean
    public IRule ribbonRule(){

        RetryRule retryRule = new RetryRule();

        return retryRule;
    }

}
