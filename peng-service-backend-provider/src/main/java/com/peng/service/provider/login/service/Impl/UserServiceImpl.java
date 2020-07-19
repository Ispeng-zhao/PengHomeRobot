package com.peng.service.provider.login.service.Impl;

import com.peng.domain.user.UserInfo;
import com.peng.service.provider.login.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Author peng
 * @Date 2020/7/18 19:27
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserInfo queryUser(UserInfo userInfo) {
        return null;
    }

    @Override
    public int updateUser(UserInfo updateUser) {
        return 0;
    }

    @Override
    public boolean checkUser(UserInfo checkUser) {
        return false;
    }
}
