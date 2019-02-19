package com.springys.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by yzd on 2019/2/18.
 */
@Configuration
public class MymvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/sucess").setViewName("upload");
//        registry.addViewController("123").setViewName("uploadsuccess");
    }
}
