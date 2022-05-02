package com.springdemo.helloworld.intercetor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author why
 * @createDate 2022/5/1
 */
@Component
public class RedisUrlCountInterceptor implements HandlerInterceptor {
    @Autowired
    StringRedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        redisTemplate.opsForValue().increment(uri);
        return true;
    }
}
