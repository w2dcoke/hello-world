package com.springdemo.helloworld;

import com.springdemo.helloworld.service.DeptManagerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
@Slf4j
class HelloWorldApplicationTests {
    @Autowired
    DeptManagerService deptManagerService;
    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        System.out.println(deptManagerService.list());
    }

    @Test
    void testRedis() {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("test", "test");
        log.info("test:{}", ops.get("test"));
    }

}
