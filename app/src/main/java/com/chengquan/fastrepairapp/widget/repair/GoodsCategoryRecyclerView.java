package com.chengquan.fastrepairapp.widget.repair;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.repair.GoodsCategoryBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class GoodsCategoryRecyclerView extends BaseRecyclerView<GoodsCategoryBean> {
    public GoodsCategoryRecyclerView(Context context) {
        super(context);
    }

    public GoodsCategoryRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GoodsCategoryRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_goods_category;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, GoodsCategoryBean goodsCatgoryBean, int position) {
        TextView textView = holder.findView(R.id.textview);
        textView.setText(goodsCatgoryBean.getName());
    }
}
