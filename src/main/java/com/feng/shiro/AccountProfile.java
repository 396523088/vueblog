package com.feng.shiro;

import java.io.Serializable;

/**
 * @Author lastfeng
 * @Date 2022/2/14 0:19
 * @Description 登录成功之后返回的一个用户信息的载体
 * @Version 1.0
 **/
public class AccountProfile implements Serializable {
    private Long id;

    private String username;

    private String avatar;
}
