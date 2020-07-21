package com.peng.service.provider.interceptor;

import com.peng.domain.config.SessionConfig;
import com.peng.domain.utils.CookieUtils;
import com.peng.domain.utils.Md5Base64;
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

        String token = CookieUtils.getCookieValue(request,SessionConfig.tokeName);
        String temp_token = Md5Base64.EncodeByMd5("111111");
        if (!"123456".equals(token)){
            response.setStatus(5000);
            return false;
        }

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
