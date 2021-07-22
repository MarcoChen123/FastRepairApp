package com.chengquan.fastrepairapp.widget.exhibition;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.ExhibitionNewsBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class ExhibitionNewsRecyclerView extends BaseRecyclerView<ExhibitionNewsBean> {
    public ExhibitionNewsRecyclerView(Context context) {
        super(context);
    }

    public ExhibitionNewsRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ExhibitionNewsRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_exhibition_news;
    }

    @Override
    protected int getOriention() {
        return RecyclerView.HORIZONTAL;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, ExhibitionNewsBean exhibitionNewsBean, int position) {

    }
}
