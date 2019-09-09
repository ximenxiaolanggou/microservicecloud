package com.ximen.microservercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/4 11:19
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka02_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka02_App.class);
    }
}
