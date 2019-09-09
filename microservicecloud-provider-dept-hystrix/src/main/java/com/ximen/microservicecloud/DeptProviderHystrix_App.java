package com.ximen.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/4 19:28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class DeptProviderHystrix_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix_App.class);
    }

}
