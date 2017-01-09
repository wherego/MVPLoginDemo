package com.zzj.mvplogindemo.presenter;

import com.zzj.mvplogindemo.model.LoginPort;
import com.zzj.mvplogindemo.model.OnLoginListener;
import com.zzj.mvplogindemo.model.imple.LoginModelImple;
import com.zzj.mvplogindemo.view.LoginView;

/**
 * Created by zzj on 2017/1/6.
 */
public class LoginPresenter implements OnLoginListener {
    private LoginPort loginPort;//登录接口
    private LoginView loginView;//登录veiw
    //实例化登录接口和登录view
    public LoginPresenter(LoginView loginView){
        this.loginView = loginView;
        loginPort = new LoginModelImple();
    }
    /**
     * 将从view层中获取的用户名和密码传送给Model层
     * 然后让activity中的登录按钮调用此方法
     */
    public void login(){
        String username = loginView.getUsername();
        String password = loginView.getPassword();
        loginPort.login(username,password,this);
    }
    @Override
    public void onUsernameError() {
        loginView.showToast("用户名或者密码错误");
    }
    @Override
    public void onSuccess() {
        loginView.showToast("登录成功！");
    }
    @Override
    public void onFailure() {
        loginView.showToast("异常错误！");
    }
}
