package com.chengquan.fastrepairapp.activity.study;

import android.os.Bundle;
import android.view.View;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.study.CertificateBean;
import com.chengquan.fastrepairapp.widget.GridDividerItemDecoration;
import com.chengquan.fastrepairapp.widget.study.MyCertificateRecyclerView;
import com.chengquan.framework.baseactivity.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/7/22.
 * Describe :我的证书
 */
public class MyCertificateActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.recycler_my_collect)
    MyCertificateRecyclerView myCertificateRecyclerView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_my_certificate, "我的证书");
    }

    @Override
    protected void findView() {
        super.findView();
    }

    @Override
    protected void setViewData() {
        List<CertificateBean> list= new ArrayList<>();
        list.add(new CertificateBean());
        list.add(new CertificateBean());
        list.add(new CertificateBean());
        list.add(new CertificateBean());
        list.add(new CertificateBean());
        list.add(new CertificateBean());

        GridDividerItemDecoration gridDividerItemDecoration = new GridDividerItemDecoration(2, ContextCompat.getColor(this, R.color.gray_f4f4f4));//四周都有分割线
        myCertificateRecyclerView.addItemDecoration(gridDividerItemDecoration);
        myCertificateRecyclerView.setAdapter(list);
        super.setViewData();
    }

    @OnClick
    public void onClick(View view) {
        switch (view.getId()) {

        }
    }
}
