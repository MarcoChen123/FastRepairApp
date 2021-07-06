package com.chengquan.fastrepairapp.widget.repair;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class SkillsRecyclerView extends BaseRecyclerView<String> {
    public SkillsRecyclerView(Context context) {
        super(context);
    }

    public SkillsRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SkillsRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_skills;
    }

    @Override
    protected int getLayoutType() {
        return LAYOUT_GRID;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, String s, int position) {
        LabelCheckbox checkbox = holder.findView(R.id.labelCheckbox);
        checkbox.setText(s);
        checkbox.setEnable(false);
    }
}
