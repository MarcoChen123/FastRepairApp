package com.chengquan.fastrepairapp.activity.study;

import android.os.Bundle;
import android.widget.CompoundButton;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.fragment.study.MyExamFragment;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

/**
 * Created by LRJ on 2021/6/22.
 * Describe :我的考试
 */
public class MyExamActivity extends BaseActivity implements CompoundButton.OnCheckedChangeListener {
    private MyExamFragment myExamFragment;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_my_exam, "我的考试");
    }

    @Override
    protected void initData() {
        super.initData();
        myExamFragment = new MyExamFragment();
    }

    @Override
    protected void setViewData() {
        super.setViewData();
//        rbSell.setChecked(true);
//        rbSell.setOnCheckedChangeListener(this);
//        rbBuy.setOnCheckedChangeListener(this);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.frameLayout, myExamFragment);
        transaction.commitAllowingStateLoss();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            switch (buttonView.getId()) {
//                case R.id.rb_sell:
//
//                    break;
//                case R.id.rb_buy:
//
//                    break;
            }
        }
    }
}
