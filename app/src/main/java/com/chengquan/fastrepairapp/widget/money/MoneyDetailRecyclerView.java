package com.chengquan.fastrepairapp.widget.money;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.money.MoneyDetailBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class MoneyDetailRecyclerView extends BaseRecyclerView<MoneyDetailBean> {
    public MoneyDetailRecyclerView(Context context) {
        super(context);
    }

    public MoneyDetailRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MoneyDetailRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_money_detail;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, MoneyDetailBean productOrderBean, int position) {

    }
}
