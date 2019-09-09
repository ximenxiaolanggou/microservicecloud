package com.ximen.microservicecloud.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ximen.microservicecloud.entity.Dept;

/**
 * @author ZhiShun.Cai
 * @Date 2019/9/3 20:11
 */
@Mapper
public interface DeptMapper extends BaseMapper<Dept> {
}
