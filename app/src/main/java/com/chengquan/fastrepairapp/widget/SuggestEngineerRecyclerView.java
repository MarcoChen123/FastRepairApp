package com.chengquan.fastrepairapp.widget;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.SuggestEngineerBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class SuggestEngineerRecyclerView extends BaseRecyclerView<SuggestEngineerBean> {
    public SuggestEngineerRecyclerView(Context context) {
        super(context);
    }

    public SuggestEngineerRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SuggestEngineerRecyclerView(Context context, @Nullable  AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_suggest_engineer;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, SuggestEngineerBean suggestEngineerBean, int position) {

    }
}
