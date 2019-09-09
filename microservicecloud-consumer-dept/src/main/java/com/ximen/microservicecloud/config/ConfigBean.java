package com.ximen.microservicecloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/3 20:51
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //Spring Cloud Ribbom是基于Netflix Ribbon实现的一套客户端负载均衡的工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
