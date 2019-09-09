package com.ximen.microservercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/3 21:33
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_App.class);
    }
}
