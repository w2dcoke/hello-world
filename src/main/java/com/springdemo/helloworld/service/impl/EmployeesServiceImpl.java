package com.springdemo.helloworld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springdemo.helloworld.domain.Employees;
import com.springdemo.helloworld.mapper.EmployeesMapper;
import com.springdemo.helloworld.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author kaihy
 * @description 针对表【employees】的数据库操作Service实现
 * @createDate 2022-04-28 08:50:06
 */
@Service("EmployeesService")
public class EmployeesServiceImpl extends ServiceImpl<EmployeesMapper, Employees> implements EmployeesService {
    @Autowired
    EmployeesMapper employeesMapper;

    @Override
    public Employees getById(Serializable id) {
        return super.getById(id);
    }
}
