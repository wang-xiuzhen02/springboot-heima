package com.wxz.heima;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wxz.heima.mapper")
public class SpringbootHeimaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHeimaApplication.class, args);
    }

}
