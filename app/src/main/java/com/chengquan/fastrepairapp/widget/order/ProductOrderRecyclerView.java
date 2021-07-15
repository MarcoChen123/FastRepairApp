package com.chengquan.fastrepairapp.widget.order;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.order.ProductOrderBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class ProductOrderRecyclerView extends BaseRecyclerView<ProductOrderBean> {
    public ProductOrderRecyclerView(Context context) {
        super(context);
    }

    public ProductOrderRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ProductOrderRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_product_order;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, ProductOrderBean productOrderBean, int position) {

    }
}
