package com.wxz.heima.mapper;

import com.wxz.heima.entity.Test;
import com.wxz.heima.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author wxz
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2022-09-28 09:40:33
 * @Entity com.wxz.heima.entity.User
 */
public interface UserMapper extends BaseMapper<User> {


    @Select("select * from user")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "username", property = "username"),
            @Result(column = "password", property = "password"),
            @Result(column = "state", property = "state"),
            @Result(column = "role", property = "role"),
            @Result(column = "id", property = "tests", javaType = List.class,
                    many = @Many(select = "com.wxz.heima.mapper.TestMapper.getByUid")),
    })
    List<User> getAllUserAndTest();
}




