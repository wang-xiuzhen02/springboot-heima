package com.wxz.heima.service;

import com.wxz.heima.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.PrimitiveIterator;

/**
* @author wxz
* @description 针对表【test】的数据库操作Service
* @createDate 2022-09-28 10:07:28
*/
public interface TestService extends IService<Test> {


    List<Test> getTestAndUser();
}
