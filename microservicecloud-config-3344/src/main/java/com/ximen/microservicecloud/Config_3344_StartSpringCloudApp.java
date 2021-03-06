package com.ximen.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/5 16:10
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StartSpringCloudApp{
    public static void main(String[] args)
    {
        SpringApplication.run(Config_3344_StartSpringCloudApp.class,args);
    }
}
