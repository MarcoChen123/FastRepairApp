package com.chengquan.fastrepairapp.widget.study;

import android.content.Context;
import android.util.AttributeSet;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.study.MyExamBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class MyExamRecyclerView extends BaseRecyclerView<MyExamBean> {
    public MyExamRecyclerView(Context context) {
        super(context);
    }

    public MyExamRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyExamRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_my_exam;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, MyExamBean productOrderBean, int position) {

    }
}
