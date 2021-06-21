package com.chengquan.fastrepairapp.activity.vip;

import android.os.Bundle;
import android.widget.ImageView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.chengquan.framework.util.CodeUtil;

import androidx.annotation.Nullable;

public class VipRegisterActivity extends BaseActivity {
    private ImageView ivVerifyCode;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_vip_register, "会员注册");
    }

    @Override
    protected void findView() {
        super.findView();
        ivVerifyCode = findViewById(R.id.iv_code);
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        ivVerifyCode.setImageBitmap(CodeUtil.getInstence().createBitmap());
    }
}
