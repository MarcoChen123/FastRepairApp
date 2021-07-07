package com.chengquan.fastrepairapp.widget.repair;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.repair.CasePictureBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class CasePictureRecyclerView extends BaseRecyclerView<CasePictureBean> {
    public CasePictureRecyclerView(Context context) {
        super(context);
    }

    public CasePictureRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CasePictureRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_case_picture;
    }

    @Override
    protected int getLayoutType() {
        return LAYOUT_GRID;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, CasePictureBean casePictureBean, int position) {

    }
}
