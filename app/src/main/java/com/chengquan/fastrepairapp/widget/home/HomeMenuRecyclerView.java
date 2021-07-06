package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.HomeMenuBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class HomeMenuRecyclerView extends BaseRecyclerView<HomeMenuBean> {
    public HomeMenuRecyclerView(Context context) {
        super(context);
    }

    public HomeMenuRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HomeMenuRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_home_menu;
    }

    @Override
    protected int getLayoutType() {
        return LAYOUT_GRID;
    }

    @Override
    protected int getLayoutColumn() {
        return 4;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, HomeMenuBean homeMenuBean, int position) {
        ImageView imageView = holder.findView(R.id.imageView);
        TextView textView = holder.findView(R.id.textview);
        Glide.with(getContext()).load(homeMenuBean.getRes()).into(imageView);
        textView.setText(homeMenuBean.getName());
    }

}
