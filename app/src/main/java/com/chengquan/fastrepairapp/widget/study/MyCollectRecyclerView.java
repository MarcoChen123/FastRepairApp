package com.chengquan.fastrepairapp.widget.study;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.study.LatelyStudyBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class MyCollectRecyclerView extends BaseRecyclerView<LatelyStudyBean> {
    public MyCollectRecyclerView(Context context) {
        super(context);
    }

    public MyCollectRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCollectRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_my_collect;
    }

    @Override
    protected int getOriention() {
        return RecyclerView.VERTICAL;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, LatelyStudyBean latelyStudyBean, int position) {



    }
}
