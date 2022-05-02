package com.springdemo.helloworld.config;

import com.springdemo.helloworld.intercetor.LoginInterceptor;
import com.springdemo.helloworld.intercetor.RedisUrlCountInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author why
 * @date 2022/4/26
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    RedisUrlCountInterceptor redisUrlCountInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/css/**", "/js/**", "/images/**", "/fonts/**", "/", "/login");
//        registry.addInterceptor(redisUrlCountInterceptor)
//                .addPathPatterns("/**")
//                .excludePathPatterns("/css/**", "/js/**", "/images/**", "/fonts/**");
    }
}
