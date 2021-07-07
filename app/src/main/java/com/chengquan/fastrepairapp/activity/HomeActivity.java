package com.chengquan.fastrepairapp.activity;

import android.os.Bundle;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.fragment.home.HomePageFragment;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.chengquan.framework.tab.TabView;
import com.chengquan.framework.tab.TabViewChild;
import com.chengquan.framework.util.SystemUtil;
import com.qmuiteam.qmui.util.QMUIColorHelper;
import com.qmuiteam.qmui.util.QMUIResHelper;
import com.qmuiteam.qmui.widget.tab.QMUITabSegment;

import java.util.ArrayList;
import java.util.List;

import androidx.fragment.app.Fragment;
import butterknife.BindView;

public class HomeActivity extends BaseActivity {
    @BindView(R.id.tabView)
    TabView tabView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_home);
        setTranslucentStatus(R.color.blue_2A84FF);
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        initTabView();
    }

    private void initTabView(){
        List<TabViewChild> tabViewChildList = new ArrayList<>();
        tabViewChildList.add(new TabViewChild(R.drawable.ic_home_select, R.drawable.ic_home_unselect, "首页", new HomePageFragment()));
        tabViewChildList.add(new TabViewChild(R.drawable.ic_order_select, R.drawable.ic_order_unselect, "订单", new Fragment()));
        tabViewChildList.add(new TabViewChild(R.drawable.ic_home_public, R.drawable.ic_home_public, "发布", new Fragment()));
        tabViewChildList.add(new TabViewChild(R.drawable.ic_liwu_select, R.drawable.ic_liwu_unselect, "活动", new Fragment()));
        tabViewChildList.add(new TabViewChild(R.drawable.ic_home_mine_select, R.drawable.ic_home_mine_unselect, "我的", new Fragment()));
        tabView.setTabViewDefaultPosition(0);
        tabView.setTabViewChild(tabViewChildList, getSupportFragmentManager());

    }
}
