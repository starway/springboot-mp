package com.cuicui.demomp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Cuicui
 * @Description 跨域、拦截器配置
 * @Date 2020/3/2 16:12
 * @Param
 * @return
 **/
@Configuration
public class CorsConfig implements WebMvcConfigurer {


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //允许跨域访问路径
        registry.addMapping("/**")
                //允许跨域访问的源
                .allowedOrigins("*")
                //允许请求的方法
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                //预间隔时间
                .maxAge(168000)
                //允许头部设置
                .allowedHeaders("*")
                //是否发送cookie
                .allowCredentials(true);
    }

}
