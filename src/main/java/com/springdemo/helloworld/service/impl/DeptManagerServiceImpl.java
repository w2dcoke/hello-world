package com.springdemo.helloworld.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.springdemo.helloworld.domain.DeptManager;
import com.springdemo.helloworld.mapper.DeptManagerMapper;
import com.springdemo.helloworld.service.DeptManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author why
 * @date 2022/4/28
 */
@Service("DeptManagerService")
public class DeptManagerServiceImpl extends ServiceImpl<DeptManagerMapper, DeptManager> implements DeptManagerService {
    @Autowired
    DeptManagerMapper deptManagerMapper;
}
