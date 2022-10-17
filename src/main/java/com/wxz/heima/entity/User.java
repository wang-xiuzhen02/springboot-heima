package com.wxz.heima.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 
 * @TableName user
 */
@TableName(value ="user")
@Data
public class User implements Serializable {
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名

     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 角色类型
     */
    private Integer role;

    /**
     * 启用表示
     */
    private Integer state;

    /**
     * 
     */
    @TableLogic
    private Integer isDelete;

//    描述用户的所有test，并告诉mybatis不存在
    @TableField(exist = false)
    private List<Test> tests;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}