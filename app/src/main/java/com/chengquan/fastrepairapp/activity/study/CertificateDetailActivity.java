package com.chengquan.fastrepairapp.activity.study;

import android.os.Bundle;
import android.view.View;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.baseactivity.BaseActivity;


import androidx.annotation.Nullable;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/7/22.
 * Describe :证书详情
 */
public class CertificateDetailActivity extends BaseActivity implements View.OnClickListener {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_certificate_detail, "证书详情");
    }

    @Override
    protected void findView() {
        super.findView();
    }

    @Override
    protected void setViewData() {

        super.setViewData();
    }

    @OnClick
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }
}
