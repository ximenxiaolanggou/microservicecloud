package com.ximen.microservicecloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Dept> list(){
        return deptService.findAll();
    }
}
