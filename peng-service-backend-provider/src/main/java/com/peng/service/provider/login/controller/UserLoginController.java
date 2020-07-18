package com.peng.service.provider.login.controller;

import com.peng.service.provider.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author peng
 * @Date 2020/7/18 19:25
 * @Version 1.0
 */
@RequestMapping(value = "/user")
public class UserLoginController {
    @Autowired
    UserService userService;



}
