package com.wxz.heima.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName test
 */
@TableName(value ="test")
@Data
public class Test implements Serializable {


    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;


    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private Long uId;

    @TableField(exist = false)
    private User user;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}