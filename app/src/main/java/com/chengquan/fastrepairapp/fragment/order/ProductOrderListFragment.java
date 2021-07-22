package com.chengquan.fastrepairapp.fragment.order;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.order.ProductOrderBean;
import com.chengquan.fastrepairapp.widget.exhibition.HorizontalItemDecoration;
import com.chengquan.fastrepairapp.widget.order.ProductOrderRecyclerView;
import com.chengquan.framework.baseactivity.BaseFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ProductOrderListFragment extends BaseFragment {
    @BindView(R.id.recyclerview)
    ProductOrderRecyclerView productOrderRecyclerView;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_product_order_list;
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        List<ProductOrderBean> list = new ArrayList<>();
        for (int i = 0 ; i < 10; i++) {
            list.add(new ProductOrderBean());
        }
        productOrderRecyclerView.setAdapter(list);
        productOrderRecyclerView.addItemDecoration(new HorizontalItemDecoration(10,getContext()));
    }
}
