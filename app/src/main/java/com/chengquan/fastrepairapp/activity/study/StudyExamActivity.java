package com.chengquan.fastrepairapp.activity.study;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.study.LatelyStudyBean;
import com.chengquan.fastrepairapp.widget.exhibition.HorizontalItemDecoration;
import com.chengquan.fastrepairapp.widget.study.LatelyStudyRecyclerView;
import com.chengquan.framework.baseactivity.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by LRJ on 2021/7/22.
 * Describe :学习考试
 */
public class StudyExamActivity extends BaseActivity implements View.OnClickListener {


    @BindView(R.id.recycler_lately_study)
    LatelyStudyRecyclerView latelyStudyRecyclerView;
    @BindView(R.id.rel_myCourse)
    RelativeLayout relMyCourse;
    @BindView(R.id.rel_collect)
    RelativeLayout relCollect;
    @BindView(R.id.rel_myExam)
    RelativeLayout relMyExam;
    @BindView(R.id.rel_certificate)
    RelativeLayout relCertificate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_study_exam, "学习考试");
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
        list.add(new LatelyStudyBean());
        list.add(new LatelyStudyBean());
        list.add(new LatelyStudyBean());
        latelyStudyRecyclerView.addItemDecoration(new HorizontalItemDecoration(10, this));
        latelyStudyRecyclerView.setAdapter(list);
        super.setViewData();
    }

    @OnClick({R.id.rel_myCourse, R.id.rel_collect, R.id.rel_myExam, R.id.rel_certificate})
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.rel_myCourse:
                break;
            case R.id.rel_collect:
                intent = new Intent(this, MyCollectActivity.class);
                startActivity(intent);
                break;
            case R.id.rel_myExam:
                intent = new Intent(this, MyExamActivity.class);
                startActivity(intent);
                break;
            case R.id.rel_certificate:
                intent = new Intent(this, MyCertificateActivity.class);
                startActivity(intent);
                break;
        }
    }
}
