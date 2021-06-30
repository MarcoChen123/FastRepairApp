package com.chengquan.fastrepairapp.activity.repairmall;

import android.os.Bundle;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.fragment.CaseFragment;
import com.chengquan.fastrepairapp.fragment.CertificateFragment;
import com.chengquan.fastrepairapp.fragment.CustomerCommentFragment;
import com.chengquan.fastrepairapp.fragment.EngineerIntroFragment;
import com.chengquan.fastrepairapp.widget.CustomViewPager;
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

public class CompanyDataActivity extends BaseActivity {
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    CustomViewPager viewPager;

    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_company_data, "维修公司档案");
    }

    @Override
    protected void setViewData() {
        super.setViewData();

        initTabLayout();
    }

    private void initTabLayout(){
        initViewPager();
        String[] tabs = {"工程师介绍", "客户评价", "案例图片", "工程师证书"};
        for (String s : tabs) {
            tabLayout.addTab(tabLayout.newTab().setText(s));
        }
        tabLayout.setupWithViewPager(viewPager, false);
    }

    private void initViewPager(){
        fragmentList.add(new EngineerIntroFragment());
        fragmentList.add(new CustomerCommentFragment());
        fragmentList.add(new CaseFragment());
        fragmentList.add(new CertificateFragment());
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(4);
        viewPager.post(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < viewPager.getChildCount(); i++) {
                    viewPager.addHeight(i, viewPager.getChildAt(i));
                }
                viewPager.resetHeight(0);
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                viewPager.resetHeight(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    class MyAdapter extends FragmentPagerAdapter{

        private String[] tabs = {"工程师介绍", "客户评价", "案例图片", "工程师证书"};

        public MyAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }
}
