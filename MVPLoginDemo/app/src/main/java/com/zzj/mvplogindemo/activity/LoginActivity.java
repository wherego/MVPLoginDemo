package com.zzj.mvplogindemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Toast;

import com.zzj.mvplogindemo.R;
import com.zzj.mvplogindemo.presenter.LoginPresenter;
import com.zzj.mvplogindemo.view.LoginView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener,LoginView {
    private AppCompatEditText username ,password;
    private AppCompatButton loginBt;
    private LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loginPresenter = new LoginPresenter(this);
    }
    private void initView(){
        username = (AppCompatEditText) findViewById(R.id.login_username);
        password = (AppCompatEditText) findViewById(R.id.login_password);
        loginBt = (AppCompatButton) findViewById(R.id.login_loginbt);
        loginBt.setOnClickListener(this);
    }
    /**
     * 向view层暴露参数
     * @return 用户名
     */
    public String getUsername(){
        return username.getText().toString().trim();
    }
    public String getPassword(){
        return password.getText().toString().trim();
    }
    @Override
    public void showToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v) {
        loginPresenter.login();
    }
}
