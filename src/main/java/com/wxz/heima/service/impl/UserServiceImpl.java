package com.wxz.heima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wxz.heima.entity.User;
import com.wxz.heima.service.UserService;
import com.wxz.heima.mapper.UserMapper;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.soap.Addressing;
import java.util.List;

/**
* @author wxz
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-09-28 09:40:33
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserAndTest(){
        List<User> userList = userMapper.getAllUserAndTest();
        return userList;
    }

}




