package com.feng.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @Author lastfeng
 * @Date 2022/2/13 23:37
 * @Description TODO
 * @Version 1.0
 **/
public class JwtToken implements AuthenticationToken {

    public String token;

    public JwtToken(String jwt){
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
