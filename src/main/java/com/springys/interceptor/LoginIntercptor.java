package com.springys.interceptor;

import com.springys.Controller.Controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by yzd on 2019/2/12.
 */
@Slf4j
@Component
public class LoginIntercptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        String md5 = request.getHeader("md5");
        log.info("进入拦截器成功");
        log.info(token);
        if (token == null||md5==null) {
            log.info("token md5为空");
            return true;
        } else {
            if (token.equals(Controller.getB(0))&&md5.equals(Controller.getB(1))) {
                log.info(Controller.getB(0));
                log.info(Controller.getB(1));
                log.info("token一样");
                return true;
            } else {
                log.info("token不一样");
                return true;
            }
        }
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
