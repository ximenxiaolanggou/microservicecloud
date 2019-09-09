package com.ximen.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/4 17:07
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ximen.microservicecloud.service"})
public class DeptConsumerFeign_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_App.class);
    }
}
