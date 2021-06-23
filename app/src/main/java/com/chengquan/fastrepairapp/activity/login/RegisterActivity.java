package com.chengquan.fastrepairapp.activity.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.CheckBox;
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
 * Describe :注册
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.et_phone)
    EditText etPhone;
    @BindView(R.id.et_Verify)
    EditText etVerify;
    @BindView(R.id.tv_getVerify)
    TextView tvGetVerify;
    @BindView(R.id.et_pwd)
    EditText etPwd;
    @BindView(R.id.et_contacts)
    EditText etContacts;
    @BindView(R.id.et_companyName)
    EditText etCompanyName;
    @BindView(R.id.et_inviteCode)
    EditText etInviteCode;
    @BindView(R.id.chk_pwd)
    CheckBox chkPwd;
    @BindView(R.id.tv_clause)
    TextView tvClause;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    @BindView(R.id.tv_goLogin)
    TextView tvGoLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_register, "会员注册");

    }

    @Override
    protected void findView() {
        super.findView();
        ButterKnife.bind(this);
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        tvGoLogin.setText(Html.fromHtml("<u>"+"已有账号，立即登录"+"</u>"));
    }

    @Override
    protected void initData() {

    }


    @OnClick({R.id.tv_getVerify, R.id.chk_pwd, R.id.tv_clause, R.id.tv_register, R.id.tv_goLogin})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_getVerify:
                break;
            case R.id.chk_pwd:
                break;
            case R.id.tv_clause:
                break;
            case R.id.tv_register:
                break;
            case R.id.tv_goLogin:
                finish();
                break;
        }
    }
}
