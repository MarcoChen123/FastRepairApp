package com.chengquan.fastrepairapp.fragment.study;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.study.MyExamBean;
import com.chengquan.fastrepairapp.widget.study.MyExamRecyclerView;
import com.chengquan.framework.baseactivity.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MyExamTabFragment extends BaseFragment {
    @BindView(R.id.recyclerview)
    MyExamRecyclerView myExamRecyclerView;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_my_exam_tab;
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        List<MyExamBean> list = new ArrayList<>();
        for (int i = 0 ; i < 2; i++) {
            list.add(new MyExamBean());
        }
        myExamRecyclerView.setAdapter(list);
    }
}
