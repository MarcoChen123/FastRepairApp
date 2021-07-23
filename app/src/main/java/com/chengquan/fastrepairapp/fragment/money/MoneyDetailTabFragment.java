package com.chengquan.fastrepairapp.fragment.money;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.money.MoneyDetailBean;
import com.chengquan.fastrepairapp.widget.money.MoneyDetailRecyclerView;
import com.chengquan.framework.baseactivity.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MoneyDetailTabFragment extends BaseFragment {
    @BindView(R.id.recyclerview)
    MoneyDetailRecyclerView moneyDetailRecyclerView;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_money_detail_tab;
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        List<MoneyDetailBean> list = new ArrayList<>();
        for (int i = 0 ; i < 2; i++) {
            list.add(new MoneyDetailBean());
        }
        moneyDetailRecyclerView.setAdapter(list);
    }
}
