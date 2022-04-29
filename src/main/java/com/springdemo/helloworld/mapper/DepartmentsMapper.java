package com.springdemo.helloworld.mapper;

import com.springdemo.helloworld.domain.Departments;

/**
* @author kaihy
* @description 针对表【departments】的数据库操作Mapper
* @createDate 2022-04-28 10:04:16
* @Entity com.springdemo.helloworld.domain.Departments
*/
public interface DepartmentsMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Departments record);

    int insertSelective(Departments record);

    Departments selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Departments record);

    int updateByPrimaryKey(Departments record);

}
