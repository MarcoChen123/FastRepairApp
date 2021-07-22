package com.chengquan.fastrepairapp.widget.exhibition;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.ExhibitionScheduleBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class ExhibitionScheduleRecyclerView extends BaseRecyclerView<ExhibitionScheduleBean> {
    public ExhibitionScheduleRecyclerView(Context context) {
        super(context);
    }

    public ExhibitionScheduleRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ExhibitionScheduleRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getLayoutType() {
        return LAYOUT_GRID;
    }

    @Override
    protected int getLayoutColumn() {
        return 2;
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_exhibition_schedule;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, ExhibitionScheduleBean exhibitionScheduleBean, int position) {

    }
}
