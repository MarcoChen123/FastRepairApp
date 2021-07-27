package com.chengquan.fastrepairapp.widget.study;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.study.CertificateDetailActivity;
import com.chengquan.fastrepairapp.bean.study.CertificateBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class MyCertificateRecyclerView extends BaseRecyclerView<CertificateBean> {
    public MyCertificateRecyclerView(Context context) {
        super(context);
    }

    public MyCertificateRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyCertificateRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_my_certificate;
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
    protected void setViewData(BaseViewHolder holder, CertificateBean latelyStudyBean, int position) {

        holder.itemView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), CertificateDetailActivity.class);
                getContext().startActivity(intent);
            }
        });

    }
}
