package com.chengquan.fastrepairapp.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.bumptech.glide.Glide;
import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.MainActivity;
import com.chengquan.fastrepairapp.impl.OnPickListener;
import com.chengquan.framework.util.ImagePickerUtil;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;
import com.lzy.imagepicker.bean.ImageItem;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class ImagePickRecyclerView extends BaseRecyclerView<ImageItem> {
    private OnPickListener onPickListener;

    public ImagePickRecyclerView(Context context) {
        super(context);
    }

    public ImagePickRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ImagePickRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setOnPickListener(OnPickListener listener){
        onPickListener = listener;
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_image_pick;
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
    protected void setViewData(BaseViewHolder holder, ImageItem imageItem, int position) {
        AppCompatImageView imageView = holder.findView(R.id.imageView);
        if(imageItem != null){
            Glide.with(getContext()).load(imageItem.path).into(imageView);
        } else {
            Glide.with(getContext()).load(R.drawable.ic_add_photo).into(imageView);
            imageView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onPickListener != null){
                        onPickListener.onPick();
                    }
                }
            });
        }
    }
}
