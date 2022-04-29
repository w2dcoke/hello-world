package com.springdemo.helloworld.service.impl;

import com.springdemo.helloworld.service.EmployeesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.ws.Service;

/**
 * @author why
 * @date 2022/4/28
 */
@SpringBootTest
class EmployeesServiceImplTest {
    @Autowired
    EmployeesService employeesService;

    @Test
    void getAll() {
    }

    @Test
    void getByEmpNo() {
        employeesService.getById(10001);
    }
}