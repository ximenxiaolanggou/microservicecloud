package com.ximen.microservicecloud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ximen.microservicecloud.entity.Dept;
import com.ximen.microservicecloud.service.DeptService;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/3 20:14
 */
@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("list")
    @HystrixCommand(fallbackMethod = "returnErr")
    public List<Dept> list(){
        throw new RuntimeException();
    }

    public List<Dept> returnErr(){
        List<Dept> list = new ArrayList<>();
        Dept dept = new Dept();
        dept.setDeptno(1L);
        dept.setDname("error");
        dept.setDsource("error");
        list.add(dept);
        return list;
    }
}
