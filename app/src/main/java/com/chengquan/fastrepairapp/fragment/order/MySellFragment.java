package com.chengquan.fastrepairapp.fragment.order;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.widget.order.ViewPagerAdapter;
import com.chengquan.framework.baseactivity.BaseFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

public class MySellFragment extends BaseFragment {
    private String[] tabs = {"全部", "待付款", "待发货", "待收货", "待评价"};
    private List<Fragment> fragmentList = new ArrayList<>();

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_my_sell;
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        initTabLayout();
    }

    private void initTabLayout(){
        initViewPager();

        for (String s : tabs) {
            tabLayout.addTab(tabLayout.newTab().setText(s));
        }
        tabLayout.setupWithViewPager(viewPager, false);
    }

    private void initViewPager(){
        fragmentList.add(new ProductOrderListFragment());
        fragmentList.add(new ProductOrderListFragment());
        fragmentList.add(new ProductOrderListFragment());
        fragmentList.add(new ProductOrderListFragment());
        fragmentList.add(new ProductOrderListFragment());
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager(), tabs, fragmentList);
        viewPager.setAdapter(adapter);

    }
}
