package com.zzj.mvplogindemo.model;

/**
 * 登录接口
 * Created by zzj on 2017/1/6.
 */
public interface LoginPort {

    void login(String username,String password,OnLoginListener onLoginListener);
}
