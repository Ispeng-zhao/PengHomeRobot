package com.peng.service.provider.login.service;

import com.peng.domain.user.UserInfo;

/**
 * @Author peng
 * @Date 2020/7/18 19:26
 * @Version 1.0
 */
public interface UserService {
    /**
     * 根据用户信息查询数据
     * @param userInfo
     * @return
     */
    public UserInfo queryUser(UserInfo userInfo);

    /**
     * 根据更新的用户数据更新数据
     * @param updateUser
     * @return
     */
    public int updateUser(UserInfo updateUser);

    /**
     * 检查用户信息是否合法
     * @param checkUser
     * @return
     */
    public boolean checkUser(UserInfo checkUser);
}
