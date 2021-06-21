package com.chengquan.fastrepairapp.activity.repairmall;

import android.os.Bundle;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.widget.CatgoryRecyclerView;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.chengquan.framework.view.BaseRecyclerView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;

public class EngineerSearchActivity extends BaseActivity {
    private CatgoryRecyclerView catgoryRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_engineer_search, "工程师查询");
    }

    @Override
    protected void findView() {
        super.findView();
        catgoryRecyclerView = findViewById(R.id.recyclerview);
    }

    @Override
    protected void setListener() {
        super.setListener();
        catgoryRecyclerView.setOnItemClickListener(new BaseRecyclerView.OnItemClickListener<String>() {
            @Override
            public void onItemClick(String data, int position) {
                catgoryRecyclerView.setSelectCatgory(data);
            }
        });
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        List<String> list = new ArrayList<>();
        list.add("维修");
        list.add("故障排查/处理");
        list.add("上门检修");
        list.add("远程交机");
        list.add("调试/送电");
        list.add("维修保养");
        list.add("升级/更换");
        list.add("装配/组立");
        list.add("大修/改造");
        list.add("设计/开发");
        catgoryRecyclerView.setAdapter(list);
    }
}
