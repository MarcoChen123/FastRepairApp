package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.money.MoneyManageActivity;
import com.chengquan.fastrepairapp.activity.study.StudyExamActivity;
import com.chengquan.fastrepairapp.bean.home.MeMenuBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class MeMenuRecyclerView extends BaseRecyclerView<MeMenuBean> {
    public MeMenuRecyclerView(Context context) {
        super(context);
    }

    public MeMenuRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MeMenuRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_me_menu;
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
    protected void setViewData(BaseViewHolder holder, MeMenuBean homeMenuBean, int position) {
        ImageView imageView = holder.findView(R.id.imageView);
        TextView textView = holder.findView(R.id.textview);
        Glide.with(getContext()).load(homeMenuBean.getRes()).into(imageView);
        textView.setText(homeMenuBean.getName());

        holder.itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (homeMenuBean.getClickUrl()) {
                    case "zjgl":
                        intent = new Intent(getContext(), MoneyManageActivity.class);
                        getContext().startActivity(intent);
                        break;
                    case "xxks":
                        intent = new Intent(getContext(), StudyExamActivity.class);
                        getContext().startActivity(intent);
                        break;
                    default:
                        break;

                }
            }
        });
    }

}
