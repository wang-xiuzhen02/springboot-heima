package com.wxz.heima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 全局配置类 —— 跨域配置类
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      //预访问的路径
                .allowedOrigins("http://localhost:8080","null")     //请求来源
                .allowedMethods("GET","POST","PUT","DELETE")        //方法
                .allowCredentials(true)     //允许携带cookie
                .maxAge(3600);      //最大时间
    }
}
