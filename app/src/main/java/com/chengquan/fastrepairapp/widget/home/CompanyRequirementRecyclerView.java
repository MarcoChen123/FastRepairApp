package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.text.Html;
import android.util.AttributeSet;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.HomeDataBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class CompanyRequirementRecyclerView extends BaseRecyclerView<HomeDataBean.PurchaseListBean> {
    public CompanyRequirementRecyclerView(Context context) {
        super(context);
    }

    public CompanyRequirementRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CompanyRequirementRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_company_requirement;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, HomeDataBean.PurchaseListBean purchaseListBean, int position) {
        TextView tvReleaseDate = holder.findView(R.id.tv_release_date);
        TextView tvDescription = holder.findView(R.id.tv_description);
        TextView tvVisitCount = holder.findView(R.id.tv_visit_count);
        TextView tvGood = holder.findView(R.id.tv_good);
        TextView tvShare = holder.findView(R.id.tv_share);
        TextView tvPrice = holder.findView(R.id.tv_price);
        TextView tvClosingDate = holder.findView(R.id.tv_closing_date);
        AppCompatImageView imageView = holder.findView(R.id.imageView);

        tvClosingDate.setText("投标截止时间：" + purchaseListBean.getClosingDate());
        tvReleaseDate.setText(purchaseListBean.getReleaseDate());
        tvDescription.setText(Html.fromHtml(purchaseListBean.getDescription()));
        tvVisitCount.setText(purchaseListBean.getReadingTimes() + "");
        tvGood.setText(purchaseListBean.getLikes() + "");
        tvShare.setText(purchaseListBean.getShareTimes() + "");
        tvPrice.setText(purchaseListBean.getPurchase() + "");
    }
}
