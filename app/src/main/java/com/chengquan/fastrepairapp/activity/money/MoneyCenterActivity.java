package com.chengquan.fastrepairapp.activity.money;

import android.os.Bundle;
import android.view.View;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/6/22.
 * Describe :资金中心
 */
public class MoneyCenterActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_money_center, "资金中心");
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
            default:
                break;
        }
    }
}
