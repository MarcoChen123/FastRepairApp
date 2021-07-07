package com.chengquan.fastrepairapp.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/6/22.
 * Describe :账号登录
 */
public class AccountLoginActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.tv_getVerify)
    TextView tvGetVerify;
    @BindView(R.id.tv_switchLoginTye)
    TextView tvSwitchLoginTye;
    @BindView(R.id.tv_login)
    TextView tvLogin;
    @BindView(R.id.tv_register)
    TextView tvRegister;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_account_login, "会员登录");
    }

    @Override
    protected void findView() {
        super.findView();
    }

    @Override
    protected void setViewData() {
        super.setViewData();

    }


    @OnClick({R.id.tv_getVerify, R.id.tv_switchLoginTye, R.id.tv_login, R.id.tv_register})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_getVerify:
                break;
            case R.id.tv_switchLoginTye:
                finish();
                break;
            case R.id.tv_login:
                break;
            case R.id.tv_register:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }
}
