package com.springdemo.helloworld.controller;

import com.springdemo.helloworld.domain.Employees;
import com.springdemo.helloworld.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author why
 * @date 2022/4/28
 */
@RestController
@RequestMapping("/emp")
public class EmployeesController {
    @Autowired
    private EmployeesService employeesService;

    @GetMapping("/{empNo}")
    public Employees getEmployees(@PathVariable("empNo") Integer empNo) {
        return employeesService.getById(empNo);
    }
}
