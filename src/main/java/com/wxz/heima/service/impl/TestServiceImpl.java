package com.wxz.heima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.heima.entity.Test;
import com.wxz.heima.entity.User;
import com.wxz.heima.mapper.UserMapper;
import com.wxz.heima.service.TestService;
import com.wxz.heima.mapper.TestMapper;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author wxz
* @description 针对表【test】的数据库操作Service实现
* @createDate 2022-09-28 10:07:28
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test>
    implements TestService{

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private UserMapper userMapper;

        public List<Test> getTestAndUser(){
            List<Test> tests = testMapper.selectList(null);
            for (Test t :
                    tests) {
                User user = userMapper.selectById(t.getUId());
                t.setUser(user);

            }
            return tests;
        }
}




