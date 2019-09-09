package com.ximen.microservercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/4 11:20
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka03_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka03_App.class);
    }
}
