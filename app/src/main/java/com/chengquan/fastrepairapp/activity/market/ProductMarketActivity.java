package com.chengquan.fastrepairapp.activity.market;

import android.os.Bundle;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.market.p.ProductMarketPresenter;
import com.chengquan.fastrepairapp.bean.home.DataBean;
import com.chengquan.fastrepairapp.bean.market.FlashSaleBean;
import com.chengquan.fastrepairapp.bean.market.ProductMarketBean;
import com.chengquan.fastrepairapp.bean.market.SpecialOfferBean;
import com.chengquan.fastrepairapp.fragment.home.ImageNetAdapter;
import com.chengquan.fastrepairapp.widget.exhibition.HorizontalItemDecoration;
import com.chengquan.fastrepairapp.widget.market.FlashSaleRecyclerView;
import com.chengquan.fastrepairapp.widget.market.MarketShopRecyclerView;
import com.chengquan.fastrepairapp.widget.market.SpecialOfferRecyclerView;
import com.chengquan.framework.api.JsonCallback;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.chengquan.framework.util.SystemUtil;
import com.lzy.okgo.model.Response;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import butterknife.BindView;

public class ProductMarketActivity extends BaseActivity {
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.recycler_special_offer)
    SpecialOfferRecyclerView specialOfferRecyclerView;
    @BindView(R.id.recycler_flash_sale)
    FlashSaleRecyclerView flashSaleRecyclerView;
    @BindView(R.id.recycler_shop)
    MarketShopRecyclerView marketShopRecyclerView;

    private ProductMarketPresenter mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_product_market, "产品商城首页");
    }

    @Override
    protected void initData() {
        super.initData();
        mPresenter = new ProductMarketPresenter();
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        initBanner();
        specialOfferRecyclerView.addItemDecoration(new HorizontalItemDecoration(12,this));
        initFlashSale();
        mPresenter.getData(new JsonCallback<ProductMarketBean>() {
            @Override
            public void onSuccess(Response<ProductMarketBean> response) {
                SystemUtil.printlnInfo(response.body().toString());
                ProductMarketBean bean = response.body();
                specialOfferRecyclerView.setAdapter(bean.getHotProducts());//特价商品列表
                marketShopRecyclerView.setAdapter(bean.getShopList());
            }

            @Override
            public void onError(Response<ProductMarketBean> response) {
                super.onError(response);
                SystemUtil.printlnInfo(response.getException().getLocalizedMessage());
            }
        });

    }

    private void initBanner() {
        ImageNetAdapter imageNetAdapter = new ImageNetAdapter(DataBean.getTestData(), false);
        CircleIndicator circleIndicator = new CircleIndicator(this);
        banner.setAdapter(imageNetAdapter)
                .addBannerLifecycleObserver(this)
                .setIndicator(circleIndicator)
                .setIndicatorNormalColor(getResources().getColor(R.color.black))
                .setIndicatorSelectedColor(getResources().getColor(R.color.banner_select));

    }

    /**
     * 限时抢购列表
     */
    private void initFlashSale(){
        List<FlashSaleBean> list = new ArrayList<>();
        list.add(new FlashSaleBean());
        list.add(new FlashSaleBean());
        list.add(new FlashSaleBean());
        flashSaleRecyclerView.addItemDecoration(new HorizontalItemDecoration(12, this));
        flashSaleRecyclerView.setAdapter(list);
    }
}
