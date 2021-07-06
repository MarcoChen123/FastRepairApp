package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.CompanyRequirementBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class SuggestProductRecyclerView extends BaseRecyclerView<CompanyRequirementBean> {
    public SuggestProductRecyclerView(Context context) {
        super(context);
    }

    public SuggestProductRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SuggestProductRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_suggest_product;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, CompanyRequirementBean companyRequirementBean, int position) {

    }
}
