package com.ximen.microservicecloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ximen.microservicecloud.entity.Dept;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/3 20:43
 */
@RestController
@RequestMapping("consumer/dept")
public class DeperConsumerController {

    @Autowired
    private RestTemplate restTemplate;

//    private final String URL_PERFIX = "http://127.0.0.1:8001";
    private final String URL_PERFIX = "http://MICROSERVERCLOUD-DEPT";

    @RequestMapping("list")
    public List<Dept> list(){
        return restTemplate.getForObject(URL_PERFIX + "/dept/list",List.class);
    }
}
