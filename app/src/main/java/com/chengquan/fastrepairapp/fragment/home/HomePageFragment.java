package com.chengquan.fastrepairapp.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.CompanyRequirementBean;
import com.chengquan.fastrepairapp.bean.home.HomeMenuBean;
import com.chengquan.fastrepairapp.bean.home.HomeSuggestMallBean;
import com.chengquan.fastrepairapp.widget.home.CompanyRequirementRecyclerView;
import com.chengquan.fastrepairapp.widget.home.HomeMenuRecyclerView;
import com.chengquan.fastrepairapp.widget.home.HomeSuggestMallRecyclerView;
import com.chengquan.fastrepairapp.widget.home.SuggestProductRecyclerView;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HomePageFragment extends Fragment {
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
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,null);
        ButterKnife.bind(this, view);

        initBanner();
        initHomeMenuList();
        initHomeSuggestMallList();
        initCompanyRequirementList();
        initSuggestProductList();
        return view;
    }

    /**
     * 设置banner
     */
    private void initBanner(){
        ImageNetAdapter imageNetAdapter = new ImageNetAdapter(DataBean.getTestData());
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
    private void initHomeMenuList(){
        homeMenuRecyclerView.setAdapter(HomeMenuBean.getMenus());
    }

    /**
     * 推荐商城
     */
    private void initHomeSuggestMallList(){
        homeSuggestMallRecyclerView.setAdapter(HomeSuggestMallBean.getTestData());
    }

    /**
     * 最新企业需求
     */
    private void initCompanyRequirementList(){
        List<CompanyRequirementBean> list = new ArrayList<>();
        list.add(new CompanyRequirementBean());
        list.add(new CompanyRequirementBean());
        companyRequirementRecyclerView.setAdapter(list);
    }

    /**
     * 最新企业需求
     */
    private void initSuggestProductList(){
        List<CompanyRequirementBean> list = new ArrayList<>();
        list.add(new CompanyRequirementBean());
        list.add(new CompanyRequirementBean());
        suggestProductRecyclerView.setAdapter(list);
    }
}
