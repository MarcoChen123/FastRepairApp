package com.chengquan.fastrepairapp.activity.order;

import android.os.Bundle;
import android.transition.Explode;
import android.view.Window;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.repairmall.CompanyDataActivity;
import com.chengquan.fastrepairapp.fragment.order.ServiceOrderFragment;
import com.chengquan.fastrepairapp.fragment.repair.CasePictureFragment;
import com.chengquan.fastrepairapp.fragment.repair.CertificateFragment;
import com.chengquan.fastrepairapp.fragment.repair.CustomerCommentFragment;
import com.chengquan.fastrepairapp.fragment.repair.EngineerIntroFragment;
import com.chengquan.fastrepairapp.widget.order.ViewPagerAdapter;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

public class ServiceOrderActivity extends BaseActivity {
    private String[] tabs = {"全部", "待服务", "服务中", "待确认", "已完成"};
    private List<Fragment> fragmentList = new ArrayList<>();

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_service_order, "服务订单");
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
        fragmentList.add(new ServiceOrderFragment());
        fragmentList.add(new ServiceOrderFragment());
        fragmentList.add(new ServiceOrderFragment());
        fragmentList.add(new ServiceOrderFragment());
        fragmentList.add(new ServiceOrderFragment());
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), tabs, fragmentList);
        viewPager.setAdapter(adapter);

    }

}
