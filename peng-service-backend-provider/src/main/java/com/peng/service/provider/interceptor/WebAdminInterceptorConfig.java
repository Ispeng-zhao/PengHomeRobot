package com.peng.service.provider.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebAdminInterceptorConfig implements WebMvcConfigurer {

    @Bean
    WebAdminInterceptor WebAdminInterceptor(){
        return  new WebAdminInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
// 常量拦截器
        registry.addInterceptor(WebAdminInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/user/tokenError")
                .excludePathPatterns("/static/**");    }
}
