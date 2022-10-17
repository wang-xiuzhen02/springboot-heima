package com.wxz.heima.mapper;

import com.wxz.heima.entity.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author wxz
* @description 针对表【test】的数据库操作Mapper
* @createDate 2022-09-28 10:07:28
* @Entity com.wxz.heima.entity.Test
*/
public interface TestMapper extends BaseMapper<Test> {

    @Select("select  * from test where u_id = #{uId}")
    List<Test> getByUid();

}





