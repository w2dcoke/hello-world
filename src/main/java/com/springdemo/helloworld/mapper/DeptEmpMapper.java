package com.springdemo.helloworld.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springdemo.helloworld.domain.DeptEmp;

/**
* @author kaihy
* @description 针对表【dept_emp】的数据库操作Mapper
* @createDate 2022-04-28 10:04:05
* @Entity com.springdemo.helloworld.domain.DeptEmp
*/
public interface DeptEmpMapper extends BaseMapper<DeptEmp> {

    int deleteByPrimaryKey(Long id);

    int insert(DeptEmp record);

    int insertSelective(DeptEmp record);

    DeptEmp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DeptEmp record);

    int updateByPrimaryKey(DeptEmp record);

}
