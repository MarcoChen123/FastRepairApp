package com.chengquan.fastrepairapp.activity.money;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/6/22.
 * Describe :资金管理
 */
public class MoneyManageActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.rel_zijin)
    RelativeLayout relZijin;
    @BindView(R.id.rel_getMoney)
    RelativeLayout relGetMoney;
    @BindView(R.id.rel_moneyDetail)
    RelativeLayout relMoneyDetail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_money_manage, "资金管理");
    }

    @Override
    protected void findView() {
        super.findView();
    }

    @Override
    protected void setViewData() {
        super.setViewData();

    }

    @OnClick({R.id.rel_zijin, R.id.rel_getMoney, R.id.rel_moneyDetail})
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.rel_zijin:
                intent = new Intent(this, MoneyCenterActivity.class);
                startActivity(intent);
                break;
            case R.id.rel_getMoney:
                intent = new Intent(this, GetMoneyActivity.class);
                startActivity(intent);
                break;
            case R.id.rel_moneyDetail:
                intent = new Intent(this, MoneyDetailActivity.class);
                startActivity(intent);
                break;
        }
    }
}
