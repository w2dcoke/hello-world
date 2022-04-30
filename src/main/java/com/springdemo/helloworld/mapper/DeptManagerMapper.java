package com.springdemo.helloworld.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springdemo.helloworld.domain.DeptManager;
import com.springdemo.helloworld.domain.Employees;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author why
 * @date 2022/4/27
 */
@Mapper
public interface DeptManagerMapper extends BaseMapper<DeptManager> {
    DeptManager getByEmpNo(Integer empNo);
    int deleteByEmpNo(Integer empNo);
}
