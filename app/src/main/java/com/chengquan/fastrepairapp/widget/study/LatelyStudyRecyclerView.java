package com.chengquan.fastrepairapp.widget.study;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.study.StudyListActivity;
import com.chengquan.fastrepairapp.bean.study.LatelyStudyBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class LatelyStudyRecyclerView extends BaseRecyclerView<LatelyStudyBean> {
    public LatelyStudyRecyclerView(Context context) {
        super(context);
    }

    public LatelyStudyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LatelyStudyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_lately_study;
    }

    @Override
    protected int getOriention() {
        return RecyclerView.HORIZONTAL;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, LatelyStudyBean latelyStudyBean, int position) {
        holder.itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), StudyListActivity.class);
                getContext().startActivity(intent);
            }
        });
    }
}
