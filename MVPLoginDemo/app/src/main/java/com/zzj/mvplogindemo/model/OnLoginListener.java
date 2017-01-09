package com.zzj.mvplogindemo.model;


public interface OnLoginListener {

    //用户名错误
    public void onUsernameError();

    // 登录成功
    public void onSuccess();
    //请求失败
    public void onFailure();
}
