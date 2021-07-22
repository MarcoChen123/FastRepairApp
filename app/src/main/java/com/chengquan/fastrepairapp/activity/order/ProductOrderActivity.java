package com.chengquan.fastrepairapp.activity.order;

import android.os.Bundle;
import android.transition.Explode;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.RadioButton;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.fragment.order.MySellFragment;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;

public class ProductOrderActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {
    @BindView(R.id.rb_sell)
    RadioButton rbSell;
    @BindView(R.id.rb_buy)
    RadioButton rbBuy;

    private MySellFragment mySellFragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_product_order, "商品订单");
    }

    @Override
    protected void initData() {
        super.initData();
        mySellFragment = new MySellFragment();
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        rbSell.setChecked(true);
        rbSell.setOnCheckedChangeListener(this);
        rbBuy.setOnCheckedChangeListener(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.frameLayout, mySellFragment);
        transaction.commitAllowingStateLoss();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            switch (buttonView.getId()) {
                case R.id.rb_sell:

                    break;
                case R.id.rb_buy:

                    break;
            }
        }
    }
}
