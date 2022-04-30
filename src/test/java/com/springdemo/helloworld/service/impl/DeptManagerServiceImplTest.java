package com.springdemo.helloworld.service.impl;

import com.springdemo.helloworld.service.DeptManagerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author why
 * @createDate 2022/4/30
 */
@SpringBootTest
class DeptManagerServiceImplTest {
    @Autowired
    DeptManagerService deptManagerService;

    @Test
    void testGetDeptManager() {
        System.out.println(deptManagerService.getByEmpNo(110022));
    }

    @Test
    void testDeleteDeptManager() {
        System.out.println(deptManagerService.deleteByEmpNo(110420));
    }

}