package com.kdd.bo.test.mapper;

import com.kdd.bo.test.vo.TestVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {
    String selectTest();
}
