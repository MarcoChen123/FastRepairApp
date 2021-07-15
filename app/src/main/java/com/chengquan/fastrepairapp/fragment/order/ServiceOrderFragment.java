package com.chengquan.fastrepairapp.fragment.order;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.order.ServiceOrderBean;
import com.chengquan.fastrepairapp.widget.order.ServiceOrderRecyclerView;
import com.chengquan.framework.baseactivity.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ServiceOrderFragment extends BaseFragment {
    @BindView(R.id.recycler_service_order)
    ServiceOrderRecyclerView serviceOrderRecyclerView;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_service_order;
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        List<ServiceOrderBean> list = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(new ServiceOrderBean());
        }
        serviceOrderRecyclerView.setAdapter(list);
    }
}
