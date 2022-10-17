package com.wxz.heima.service;

import com.wxz.heima.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author wxz
* @description 针对表【user】的数据库操作Service
* @createDate 2022-09-28 09:40:33
*/
public interface UserService extends IService<User> {

    List<User> getUserAndTest();

}
