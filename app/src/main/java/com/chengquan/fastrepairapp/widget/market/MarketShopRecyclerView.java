package com.chengquan.fastrepairapp.widget.market;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.market.ProductMarketBean;
import com.chengquan.framework.BuildConfig;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class MarketShopRecyclerView extends BaseRecyclerView<ProductMarketBean.ShopListBean> {
    public MarketShopRecyclerView(Context context) {
        super(context);
    }

    public MarketShopRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MarketShopRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_market_shop;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, ProductMarketBean.ShopListBean shopListBean, int position) {
        AppCompatImageView imageView = holder.findView(R.id.imageView);
        TextView tvName = holder.findView(R.id.tv_name);
        TextView tvIndustry = holder.findView(R.id.tv_industry);
        TextView tvCategory = holder.findView(R.id.tv_category);
        TextView tvAddress = holder.findView(R.id.tv_address);
        TextView tvUpdateTime = holder.findView(R.id.tv_update_time);
        TextView tvLookNum = holder.findView(R.id.tv_look_num);
        TextView tvGood = holder.findView(R.id.tv_good);
        TextView tvShare = holder.findView(R.id.tv_share);

        tvName.setText(shopListBean.getCompanyName());
        tvAddress.setText("地址：" + shopListBean.getCompanyAddress());
        tvUpdateTime.setText(shopListBean.getCreateDate());

        Glide.with(getContext()).load(BuildConfig.apiUrl + shopListBean.getLogo()).into(imageView);

    }
}
