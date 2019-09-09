package com.ximen.microservicecloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ximen.microservicecloud.entity.Dept;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/4 17:09
 */
@FeignClient(value = "microservercloud-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptService {

    @RequestMapping("/dept/list")
    public List<Dept> list();
}
