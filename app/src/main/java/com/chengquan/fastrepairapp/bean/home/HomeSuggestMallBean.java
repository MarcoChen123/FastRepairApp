package com.chengquan.fastrepairapp.bean.home;

import com.chengquan.fastrepairapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeSuggestMallBean {
    private int res;
    private String name;

    public HomeSuggestMallBean(int res, String name) {
        this.res = res;
        this.name = name;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<HomeSuggestMallBean> getTestData(){
        List<HomeSuggestMallBean> list = new ArrayList<>();
        list.add(new HomeSuggestMallBean(R.drawable.ic_test_shukong, "数控机床"));
        list.add(new HomeSuggestMallBean(R.drawable.ic_test_other, "特种其他"));
        list.add(new HomeSuggestMallBean(R.drawable.ic_test_robot, "工业机器人"));
        list.add(new HomeSuggestMallBean(R.drawable.ic_test_ai, "智能自动化"));
        list.add(new HomeSuggestMallBean(R.drawable.ic_test_shukong, "数控机床"));
        list.add(new HomeSuggestMallBean(R.drawable.ic_test_other, "特种其他"));
        list.add(new HomeSuggestMallBean(R.drawable.ic_test_robot, "工业机器人"));
        list.add(new HomeSuggestMallBean(R.drawable.ic_test_ai, "智能自动化"));
        return list;
    }
}
