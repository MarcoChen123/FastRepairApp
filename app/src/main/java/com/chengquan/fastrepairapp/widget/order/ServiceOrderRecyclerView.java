package com.chengquan.fastrepairapp.widget.order;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.order.OrderDetailActivity;
import com.chengquan.fastrepairapp.bean.order.ServiceOrderBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class ServiceOrderRecyclerView extends BaseRecyclerView<ServiceOrderBean> {
    public ServiceOrderRecyclerView(Context context) {
        super(context);
    }

    public ServiceOrderRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ServiceOrderRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_service_order;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, ServiceOrderBean serviceOrderBean, int position) {
        Button button = holder.findView(R.id.btn_detail);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), OrderDetailActivity.class);
                getContext().startActivity(intent);
            }
        });
    }
}
