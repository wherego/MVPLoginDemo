package com.zzj.mvplogindemo.view;

/**
 *
 * Created by zzj on 2017/1/6.
 */
public interface LoginView {
    //获取activity中的用户名密码
    public String getUsername();
    public String getPassword();

    public void showToast(String msg);
}
