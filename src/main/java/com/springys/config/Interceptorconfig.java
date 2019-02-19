package com.springys.config;

import com.springys.interceptor.LoginIntercptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * Created by yzd on 2019/2/12.
 */
@Configuration
public class Interceptorconfig implements WebMvcConfigurer {
    @Resource
    private LoginIntercptor loginIntercptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginIntercptor).addPathPatterns("/**").excludePathPatterns("/login","/error","/redis","/cache","/SelectInformation","/Md5Login","/Jparunning1","/PageSelect","/toUpload","/upload","/*.html","/sucess","/testHttpMessageDown","/123","/ttt","/PublicJavaTools");
    }
}
