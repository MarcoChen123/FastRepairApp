package com.chengquan.fastrepairapp.activity.money;

import android.os.Bundle;
import android.widget.CompoundButton;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.fragment.money.MoneyDetailFragment;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/**
 * Created by LRJ on 2021/6/22.
 * Describe :账单明细
 */
public class MoneyDetailActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {
    private MoneyDetailFragment moneyDetailFragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_money_detail, "账单明细");
    }

    @Override
    protected void initData() {
        super.initData();
        moneyDetailFragment = new MoneyDetailFragment();
    }

    @Override
    protected void setViewData() {
        super.setViewData();
//        rbSell.setChecked(true);
//        rbSell.setOnCheckedChangeListener(this);
//        rbBuy.setOnCheckedChangeListener(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.frameLayout, moneyDetailFragment);
        transaction.commitAllowingStateLoss();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            switch (buttonView.getId()) {
//                case R.id.rb_sell:
//
//                    break;
//                case R.id.rb_buy:
//
//                    break;
            }
        }
    }
}
