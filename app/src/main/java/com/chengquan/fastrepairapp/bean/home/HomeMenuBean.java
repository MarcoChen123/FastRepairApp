package com.chengquan.fastrepairapp.bean.home;

import com.chengquan.fastrepairapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeMenuBean {
    private String name;
    private int res;

    public HomeMenuBean(String name, int res) {
        this.name = name;
        this.res = res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public static List<HomeMenuBean> getMenus(){
        List<HomeMenuBean> list = new ArrayList<>();
        list.add(new HomeMenuBean("立即报修", R.drawable.ic_menu_repair));
        list.add(new HomeMenuBean("一键采购", R.drawable.ic_menu_buy));
        list.add(new HomeMenuBean("需求大厅", R.drawable.ic_menu_requirement));
        list.add(new HomeMenuBean("机加订单", R.drawable.ic_menu_order));
        list.add(new HomeMenuBean("特价商城", R.drawable.ic_menu_shopping));
        list.add(new HomeMenuBean("拍卖商城", R.drawable.ic_menu_auction));
        list.add(new HomeMenuBean("竞价商城", R.drawable.ic_menu_jingjia));
        list.add(new HomeMenuBean("线上展会", R.drawable.ic_menu_online));
        list.add(new HomeMenuBean("急速学院", R.drawable.ic_menu_school));
        list.add(new HomeMenuBean("急速筹", R.drawable.ic_menu_jisuchou));
        return list;
    }
}
