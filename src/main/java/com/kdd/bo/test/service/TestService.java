package com.kdd.bo.test.service;

import com.kdd.bo.test.mapper.TestMapper;
import com.kdd.bo.test.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    public TestMapper mapper;

    public String selectTest(){
        return mapper.selectTest();
    }
}
