package com.springdemo.helloworld.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springdemo.helloworld.domain.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author why
 * @description 针对表【employees】的数据库操作Mapper
 * @createDate 2022-04-28 08:50:06
 * @Entity com.springdemo.helloworld.domain.Employees
 */
@Mapper
public interface EmployeesMapper extends BaseMapper<Employees> {

}
