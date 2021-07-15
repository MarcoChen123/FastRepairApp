package com.chengquan.fastrepairapp.fragment.order;

import android.app.ActivityOptions;
import android.content.Intent;
import android.view.View;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.order.ProductOrderActivity;
import com.chengquan.fastrepairapp.activity.order.ServiceOrderActivity;
import com.chengquan.framework.baseactivity.BaseFragment;

import butterknife.OnClick;

public class OrderFragment extends BaseFragment implements View.OnClickListener {
    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_order;
    }

    @Override
    protected void setViewData() {
        super.setViewData();
    }

    @OnClick({R.id.rl_service_order, R.id.rl_product_order})
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.rl_service_order:
                intent = new Intent(getActivity(), ServiceOrderActivity.class);
                startActivity(intent);
                break;

            case R.id.rl_product_order:
                intent = new Intent(getActivity(), ProductOrderActivity.class);
                startActivity(intent);
                break;
        }
    }
}
