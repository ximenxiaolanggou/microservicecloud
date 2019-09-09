package com.ximen.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/3 20:04
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider02_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider02_App.class);
    }
}
