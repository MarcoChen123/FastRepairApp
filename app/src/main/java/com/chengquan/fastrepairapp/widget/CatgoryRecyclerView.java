package com.chengquan.fastrepairapp.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class CatgoryRecyclerView extends BaseRecyclerView<String> {
    private String selectCatgory;

    public CatgoryRecyclerView(Context context) {
        super(context);
    }

    public CatgoryRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CatgoryRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setSelectCatgory(String s){
        selectCatgory = s;
        notifyDataSetChanged();
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_repair_catgory;
    }

    @Override
    protected int getOriention() {
        return RecyclerView.HORIZONTAL;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, String s, int position) {
        TextView textView = holder.findView(R.id.textview);
        textView.setText(s);
        if(TextUtils.equals(selectCatgory, s)){
            textView.setTextColor(getResources().getColor(R.color.blue_016DB6));
        } else {
            textView.setTextColor(getResources().getColor(R.color.grey_333));
        }
    }
}
