package com.chengquan.fastrepairapp.widget.repair;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class HotBrandRecyclerView extends BaseRecyclerView<Integer> {
    public HotBrandRecyclerView(Context context) {
        super(context);
    }

    public HotBrandRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HotBrandRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getLayoutType() {
        return LAYOUT_GRID;
    }

    @Override
    protected int getLayoutColumn() {
        return 3;
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_hot_brand;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, Integer integer, int position) {
        ImageView imageView = holder.findView(R.id.imageView);
        imageView.setImageResource(integer);
    }
}
