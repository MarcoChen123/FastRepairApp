package com.chengquan.fastrepairapp.activity.login;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/6/22.
 * Describe :登录
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.tv_companyLogin)
    TextView tvCompanyLogin;
    @BindView(R.id.tv_pwdLogin)
    TextView tvPwdLogin;
    @BindView(R.id.tv_engineerLogin)
    TextView tvEngineerLogin;
    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.tv_getVerify)
    TextView tvGetVerify;
    @BindView(R.id.chk_pwd)
    CheckBox chkPwd;
    @BindView(R.id.tv_forgetPwd)
    TextView tvForgetPwd;
    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.tv_register)
    TextView tvRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_login, "会员登录");
    }

    @Override
    protected void findView() {
        super.findView();
    }

    @Override
    protected void setViewData() {
        super.setViewData();

    }


    @OnClick({R.id.tv_companyLogin, R.id.tv_pwdLogin, R.id.tv_engineerLogin,R.id.tv_getVerify, R.id.chk_pwd, R.id.tv_forgetPwd, R.id.tv_register})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_companyLogin:
                tvCompanyLogin.setTextColor(ContextCompat.getColor(this, R.color.blue_016DB6));
                tvCompanyLogin.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                tvCompanyLogin.setTextSize(18);

                tvEngineerLogin.setTextColor(ContextCompat.getColor(this, R.color.grey_999));
                tvEngineerLogin.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                tvEngineerLogin.setTextSize(16);
                break;
            case R.id.tv_engineerLogin:
                tvEngineerLogin.setTextColor(ContextCompat.getColor(this, R.color.blue_016DB6));
                tvEngineerLogin.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));
                tvEngineerLogin.setTextSize(18);

                tvCompanyLogin.setTextColor(ContextCompat.getColor(this, R.color.grey_999));
                tvCompanyLogin.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
                tvCompanyLogin.setTextSize(16);
                break;
            case R.id.tv_pwdLogin:
                startActivity(new Intent(this, AccountLoginActivity.class));
                break;
            case R.id.tv_getVerify:
                break;
            case R.id.chk_pwd:
                break;
            case R.id.tv_forgetPwd:
                break;
            case R.id.tv_register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }


}
