package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.HomeSuggestMallBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

public class HomeSuggestMallRecyclerView extends BaseRecyclerView<HomeSuggestMallBean> {
    public HomeSuggestMallRecyclerView(Context context) {
        super(context);
    }

    public HomeSuggestMallRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public HomeSuggestMallRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_home_suggest_mall;
    }

    @Override
    protected int getOriention() {
        return RecyclerView.HORIZONTAL;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, HomeSuggestMallBean homeSuggestMallBean, int position) {
        AppCompatImageView imageView = holder.findView(R.id.imageView);
        TextView textView = holder.findView(R.id.textview);
        Glide.with(getContext()).load(homeSuggestMallBean.getRes()).into(imageView);
        textView.setText(homeSuggestMallBean.getName());
    }
}
