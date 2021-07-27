package com.chengquan.fastrepairapp.fragment.study;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.widget.order.ViewPagerAdapter;
import com.chengquan.framework.baseactivity.BaseFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;

public class MyExamFragment extends BaseFragment {
    private String[] tabs = {"全部考试", "考试通过", "考试未通过"};
    private List<Fragment> fragmentList = new ArrayList<>();

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_my_exam;
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
        fragmentList.add(new MyExamTabFragment());
        fragmentList.add(new MyExamTabFragment());
        fragmentList.add(new MyExamTabFragment());

        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager(), tabs, fragmentList);
        viewPager.setAdapter(adapter);

    }
}
