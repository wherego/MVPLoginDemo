package com.zzj.mvplogindemo.model.imple;

import com.zzj.mvplogindemo.model.LoginPort;
import com.zzj.mvplogindemo.model.OnLoginListener;

/** 处理网络请求的操作
 * Created by zzj on 2017/1/6.
 */
public class LoginModelImple implements LoginPort {
    @Override
    public void login(String username, String password, OnLoginListener onLoginListener) {

        if(username.equals("admin")&&password.equals("123456")){
            onLoginListener.onSuccess();//登录成功
        }else if(!username.equals("admian")||!password.equals("123456")){
            onLoginListener.onUsernameError();//用户名或者密码错误
        }else {
            onLoginListener.onFailure();//登录失败
        }

    }
}
