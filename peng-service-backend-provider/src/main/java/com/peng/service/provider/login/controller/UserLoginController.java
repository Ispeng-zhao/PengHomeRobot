package com.peng.service.provider.login.controller;

import com.peng.domain.config.RedisConfig;
import com.peng.domain.result.ResponseResult;
import com.peng.domain.user.UserInfo;
import com.peng.domain.utils.CookieUtils;
import com.peng.domain.utils.Md5Base64;
import com.peng.service.provider.feign.redis.RedisService;
import com.peng.service.provider.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
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
    @Autowired
    RedisService redisService;

    /**
     * 用户登录
     * @return
     */
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public ResponseResult<Map<String,Object>> userLogin(@RequestBody UserInfo userInfo) throws Exception {
        //账号密码正确

        //创建token
        String token = Md5Base64.EncodeByMd5(userInfo.getPassword());
        //redis设置toekn
       /* redisService.put(userInfo.getUsername(),token, RedisConfig.timeout);*/

        //登录结束返回给前台的结果
        Map<String,Object> data= new HashMap<>();
        data.put("token",token);;
       /* CookieUtils.setCookie(request,response,"token22222",token,60*60*24);*/
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



    @RequestMapping(value = "/tokenError",method = RequestMethod.POST)
    public ResponseResult tokenError(){
        return new ResponseResult(20000,"tokenError @!!",null);
    }
}
