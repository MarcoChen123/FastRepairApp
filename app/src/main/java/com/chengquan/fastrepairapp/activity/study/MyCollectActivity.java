package com.chengquan.fastrepairapp.activity.study;

import android.os.Bundle;
import android.view.View;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.study.LatelyStudyBean;
import com.chengquan.fastrepairapp.widget.study.MyCollectRecyclerView;
import com.chengquan.framework.baseactivity.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/7/22.
 * Describe :我的收藏
 */
public class MyCollectActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.recycler_my_collect)
    MyCollectRecyclerView myCollectRecyclerView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_my_collect, "我的收藏");
    }

    @Override
    protected void findView() {
        super.findView();
    }

    @Override
    protected void setViewData() {
        List<LatelyStudyBean> list = new ArrayList<>();
        list.add(new LatelyStudyBean());
        list.add(new LatelyStudyBean());

        myCollectRecyclerView.setAdapter(list);
        super.setViewData();
    }

    @OnClick
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }
}
