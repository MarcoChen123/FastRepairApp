package com.chengquan.fastrepairapp.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.fragment.home.ExhibitionFragment;
import com.chengquan.fastrepairapp.fragment.home.HomePageFragment;
import com.chengquan.fastrepairapp.fragment.home.HomePublishFragment;
import com.chengquan.fastrepairapp.fragment.home.MePageFragment;
import com.chengquan.fastrepairapp.fragment.order.OrderFragment;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.chengquan.framework.tab.TabView;
import com.chengquan.framework.tab.TabViewChild;

import java.util.ArrayList;
import java.util.List;

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
        tabViewChildList.add(new TabViewChild(R.drawable.ic_order_select, R.drawable.ic_order_unselect, "订单", new OrderFragment()));
        tabViewChildList.add(new TabViewChild(R.drawable.ic_home_public, R.drawable.ic_home_public, "发布", new HomePublishFragment()));
        tabViewChildList.add(new TabViewChild(R.drawable.ic_liwu_select, R.drawable.ic_liwu_unselect, "展会", new ExhibitionFragment()));
        tabViewChildList.add(new TabViewChild(R.drawable.ic_home_mine_select, R.drawable.ic_home_mine_unselect, "我的", new MePageFragment()));
        tabView.setTabViewChild(tabViewChildList, getSupportFragmentManager());
        tabView.setOnTabChildClickListener(new TabView.OnTabChildClickListener() {
            @Override
            public void onTabChildClick(int position, ImageView imageView, TextView textView) {
                if(position == 0) {
                    setTranslucentStatus(R.color.blue_2A84FF);
//                } else if(position == 2 || position == 3){
//                    setTranslucentStatus(R.color.blue_016DB6);
                } else {
                    setTranslucentStatus(R.color.blue_016DB6);
                }
            }
        });

    }
}
