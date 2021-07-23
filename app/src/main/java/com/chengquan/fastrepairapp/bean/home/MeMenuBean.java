package com.chengquan.fastrepairapp.bean.home;

import com.chengquan.fastrepairapp.R;

import java.util.ArrayList;
import java.util.List;

public class MeMenuBean {
    private String name;
    private int res;
    private String clickUrl;

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl;
    }

    public MeMenuBean(String name, int res, String clickUrl) {
        this.name = name;
        this.res = res;
        this.clickUrl = clickUrl;
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

    public static List<MeMenuBean> getMenus() {
        List<MeMenuBean> list = new ArrayList<>();
        list.add(new MeMenuBean("维修订单", R.drawable.ic_repair_order, "wxdd"));
        list.add(new MeMenuBean("学习考试", R.drawable.ic_study, "xxks"));
        list.add(new MeMenuBean("我的邀请", R.drawable.ic_invite, "wdyq"));
        list.add(new MeMenuBean("急速筹", R.drawable.ic_quick, "jsc"));
        list.add(new MeMenuBean("资金管理", R.drawable.ic_money_manage, "zjgl"));
        list.add(new MeMenuBean("消息管理", R.drawable.ic_msg_manage, "xxgl"));
        list.add(new MeMenuBean("我的论坛", R.drawable.ic_forum, "wdlt"));
        list.add(new MeMenuBean("基本资料", R.drawable.ic_base_info, "jbzl"));
        return list;
    }
}
