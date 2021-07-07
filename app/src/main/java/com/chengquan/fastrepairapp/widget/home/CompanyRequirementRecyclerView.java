package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class CompanyRequirementRecyclerView extends BaseRecyclerView {
    public CompanyRequirementRecyclerView(Context context) {
        super(context);
    }

    public CompanyRequirementRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CompanyRequirementRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_company_requirement;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, Object o, int position) {

    }
}
