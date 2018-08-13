package com.example.shiroweb.shiro;

import org.apache.shiro.authc.AuthenticationToken;

import java.util.Map;

public class StatelessAuthenticationToken implements AuthenticationToken {

    private static final long serialVersionUID = 1L;

    //用户身份 即用户名
    private String username;

    //存放参数的
    private Map<String,?> parmas;

    //凭证,客户端传入的消息摘要
    private String clientDigest;


    public StatelessAuthenticationToken() {

    }

    public StatelessAuthenticationToken(String username, Map<String, ?> parmas, String clientDigest) {
        super();
        this.username = username;
        this.parmas = parmas;
        this.clientDigest = clientDigest;
    }


    @Override
    public Object getPrincipal() {
        return username;
    }

    @Override
    public Object getCredentials() {
        return clientDigest;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, ?> getParmas() {
        return parmas;
    }

    public void setParmas(Map<String, ?> parmas) {
        this.parmas = parmas;
    }

    public String getClientDigest() {
        return clientDigest;
    }

    public void setClientDigest(String clientDigest) {
        this.clientDigest = clientDigest;
    }
}
