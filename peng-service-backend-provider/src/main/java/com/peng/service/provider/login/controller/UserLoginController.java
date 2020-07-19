package com.peng.service.provider.login.controller;

import com.peng.domain.result.ResponseResult;
import com.peng.domain.user.UserInfo;
import com.peng.service.provider.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author peng
 * @Date 2020/7/18 19:25
 * @Version 1.0
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/user")
public class UserLoginController {
    @Autowired
    UserService userService;

    /**
     * 用户登录
     * @return
     */
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public ResponseResult<Map<String,Object>> userLogin(@RequestBody UserInfo userInfo){
        Map<String,Object> data= new HashMap<>();
        data.put("token","123456");
        return new ResponseResult<Map<String,Object>>(20000,"SUCCESS !!",data);
    }
    @RequestMapping(value = "/info" ,method = RequestMethod.GET)
    public ResponseResult<UserInfo> userInfo(String token){
        UserInfo userInfo = new UserInfo("admin","小花","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        return new ResponseResult<UserInfo>(20000,"SUCCESS !!",userInfo);
    }
    @RequestMapping(value = "/logout" ,method = RequestMethod.POST)
    public ResponseResult userLogout(){
        return new ResponseResult(20000,"SUCCESS @!!",null);
    }
}
