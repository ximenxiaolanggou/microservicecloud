package com.ximen.microservicecloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ximen.microservicecloud.dao.DeptMapper;
import com.ximen.microservicecloud.entity.Dept;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/3 20:13
 */
@Service
@Transactional
public class DeptService {

    @Autowired
    private DeptMapper deptMapper;

    public List<Dept> findAll(){
        return deptMapper.selectList(null);
    }
}
