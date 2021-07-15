package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.CompanyRequirementBean;
import com.chengquan.fastrepairapp.bean.home.HomeDataBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class SuggestProductRecyclerView extends BaseRecyclerView<HomeDataBean.ProductListBean> {
    public SuggestProductRecyclerView(Context context) {
        super(context);
    }

    public SuggestProductRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SuggestProductRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_suggest_product;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, HomeDataBean.ProductListBean productListBean, int position) {
        AppCompatImageView imageView = holder.findView(R.id.imageView);
        TextView tvName = holder.findView(R.id.tv_name);
        TextView tvDate = holder.findView(R.id.tv_date);
        TextView tvCompanyName = holder.findView(R.id.tv_company_name);
        TextView tvDescription = holder.findView(R.id.tv_description);
        TextView tvUpdateTime = holder.findView(R.id.tv_update_time);
        TextView tvLookNum = holder.findView(R.id.tv_look_num);
        TextView tvGood = holder.findView(R.id.tv_good);
        TextView tvShare = holder.findView(R.id.tv_share);

        tvName.setText(productListBean.getProductName());
        tvDate.setText(productListBean.getAddedDate());
        tvCompanyName.setText(productListBean.getCompanyName());
        tvDescription.setText(productListBean.getShortDescription());
        tvUpdateTime.setText(productListBean.getAddedDate());
        tvLookNum.setText(productListBean.getVistiCounts() + "");

    }
}
