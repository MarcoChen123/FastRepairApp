package com.chengquan.fastrepairapp.activity.money;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/6/22.
 * Describe :提现
 */
public class GetMoneyActivity extends BaseActivity implements View.OnClickListener {

    @BindView(R.id.tv_useHistoryAccount)
    TextView tvUseHistoryAccount;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_get_money, "提现");
    }

    @Override
    protected void findView() {
        super.findView();
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        tvUseHistoryAccount.setText(Html.fromHtml("<u>" + "使用历史提现帐户" + "</u>"));
    }


    @OnClick(R.id.tv_useHistoryAccount)
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.tv_useHistoryAccount:

                break;

        }
    }
}
