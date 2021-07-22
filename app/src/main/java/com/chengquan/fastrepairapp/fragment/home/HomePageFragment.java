package com.chengquan.fastrepairapp.fragment.home;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.MainActivity;
import com.chengquan.fastrepairapp.activity.market.ProductMarketActivity;
import com.chengquan.fastrepairapp.activity.repairmall.EngineerSearchActivity;
import com.chengquan.fastrepairapp.bean.home.CompanyRequirementBean;
import com.chengquan.fastrepairapp.bean.home.DataBean;
import com.chengquan.fastrepairapp.bean.home.HomeDataBean;
import com.chengquan.fastrepairapp.bean.home.HomeMenuBean;
import com.chengquan.fastrepairapp.bean.home.HomeSuggestMallBean;
import com.chengquan.fastrepairapp.presenter.home.HomePagePresenter;
import com.chengquan.fastrepairapp.widget.home.CompanyRequirementRecyclerView;
import com.chengquan.fastrepairapp.widget.home.HomeMenuRecyclerView;
import com.chengquan.fastrepairapp.widget.home.HomeSuggestMallRecyclerView;
import com.chengquan.fastrepairapp.widget.home.MemberRecyclerView;
import com.chengquan.fastrepairapp.widget.home.SuggestProductRecyclerView;
import com.chengquan.framework.api.JsonCallback;
import com.chengquan.framework.view.BaseRecyclerView;
import com.lzy.okgo.callback.Callback;
import com.lzy.okgo.model.Response;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HomePageFragment extends Fragment implements View.OnClickListener {
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.recyclerview_home_menu)
    HomeMenuRecyclerView homeMenuRecyclerView;
    @BindView(R.id.recycler_mall)
    HomeSuggestMallRecyclerView homeSuggestMallRecyclerView;
    @BindView(R.id.recycler_company_requirement)
    CompanyRequirementRecyclerView companyRequirementRecyclerView;
    @BindView(R.id.recycler_product)
    SuggestProductRecyclerView suggestProductRecyclerView;
    @BindView(R.id.recycler_member)
    MemberRecyclerView memberRecyclerView;

    private HomePagePresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new HomePagePresenter();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);
        ButterKnife.bind(this, view);

        initBanner();
        initHomeMenuList();
        mPresenter.getHomeData(new JsonCallback<HomeDataBean>() {
            @Override
            public void onSuccess(Response<HomeDataBean> response) {
                HomeDataBean bean = response.body();
                homeSuggestMallRecyclerView.setAdapter(bean.getShopList());//推荐商城
                suggestProductRecyclerView.setAdapter(bean.getProductList());//推荐产品
                companyRequirementRecyclerView.setAdapter(bean.getPurchaseList());//最新企业需求
                memberRecyclerView.setAdapter(bean.getMemberList());
            }
        });
        return view;
    }


    /**
     * 设置banner
     */
    private void initBanner() {
        ImageNetAdapter imageNetAdapter = new ImageNetAdapter(DataBean.getTestData(), true);
        CircleIndicator circleIndicator = new CircleIndicator(getContext());
        banner.setAdapter(imageNetAdapter)
                .addBannerLifecycleObserver(this)
                .setIndicator(circleIndicator)
                .setIndicatorNormalColor(getResources().getColor(R.color.black))
                .setIndicatorSelectedColor(getResources().getColor(R.color.banner_select));

    }

    /**
     * 设置菜单项
     */
    private void initHomeMenuList() {
        homeMenuRecyclerView.setAdapter(HomeMenuBean.getMenus());
        homeMenuRecyclerView.setOnItemClickListener(new BaseRecyclerView.OnItemClickListener<HomeMenuBean>() {
            @Override
            public void onItemClick(HomeMenuBean data, int position) {
                Intent intent;
                switch (position) {
                    case 0://立即报修
                        intent = new Intent(getContext(), EngineerSearchActivity.class);
                        startActivity(intent);
                        break;

                    case 4://特价商城
                        intent = new Intent(getContext(), ProductMarketActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

}
