package com.springdemo.helloworld;

import com.springdemo.helloworld.service.DeptManagerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class HelloWorldApplicationTests {
    @Autowired
    DeptManagerService deptManagerService;

    @Test
    void contextLoads() {
        System.out.println(deptManagerService.list());
    }

}
