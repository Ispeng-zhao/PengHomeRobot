package com.peng.domain.user;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author peng
 * @Date 2020/7/18 19:46
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class UserInfo {
    private String username;
    private String password;
    /**
     * 姓名
     */
    private String name;
    /**
     * 头像地址
     */
    private String avatar;

    public UserInfo(String username, String name, String avatar) {
        this.username = username;
        this.name = name;
        this.avatar = avatar;
    }
}
