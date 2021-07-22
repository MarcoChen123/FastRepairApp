package com.chengquan.fastrepairapp.widget.market;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.market.ProductMarketBean;
import com.chengquan.fastrepairapp.bean.market.SpecialOfferBean;
import com.chengquan.framework.BuildConfig;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

public class SpecialOfferRecyclerView extends BaseRecyclerView<ProductMarketBean.HotProductsBean> {
    public SpecialOfferRecyclerView(Context context) {
        super(context);
    }

    public SpecialOfferRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SpecialOfferRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_special_offer;
    }

    @Override
    protected int getOriention() {
        return RecyclerView.HORIZONTAL;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, ProductMarketBean.HotProductsBean hotProductsBean, int position) {
        AppCompatImageView imageView = holder.findView(R.id.imageView);
        TextView tvName = holder.findView(R.id.tv_name);
        TextView tvPrice = holder.findView(R.id.tv_price);
        TextView tvSale = holder.findView(R.id.tv_sale);
        Button btnBuy = holder.findView(R.id.btn_buy);

        tvName.setText(hotProductsBean.getProductName());
        tvPrice.setText("￥" + hotProductsBean.getMarketPrice());
        Glide.with(getContext()).load(BuildConfig.apiUrl + hotProductsBean.getImagePath()).into(imageView);
    }
}
