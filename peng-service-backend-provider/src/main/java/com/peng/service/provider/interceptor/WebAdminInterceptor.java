package com.peng.service.provider.interceptor;

import com.peng.domain.config.SessionConfig;
import com.peng.domain.utils.CookieUtils;
import com.peng.service.provider.feign.redis.RedisService;
import com.peng.service.provider.login.controller.UserLoginController;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class WebAdminInterceptor implements HandlerInterceptor {

    @Autowired
    RedisService redisService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
      //token为空表示一定没有登录

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("asdas");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("asdas");
    }

}
