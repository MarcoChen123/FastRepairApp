package com.chengquan.fastrepairapp.widget.repair;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.repair.GoodsDetailBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class GoodsDetailRecyclerView extends BaseRecyclerView<GoodsDetailBean> {
    public GoodsDetailRecyclerView(Context context) {
        super(context);
    }

    public GoodsDetailRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public GoodsDetailRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_goods_detail;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, GoodsDetailBean goodsDetailBean, int position) {
        RelativeLayout rlParent = holder.findView(R.id.rl_parent);
        TextView parentTextView = holder.findView(R.id.tv_parent);
        TextView nameTextView = holder.findView(R.id.tv_name);
        if(position == 0 || !TextUtils.equals(goodsDetailBean.getParent(), getItem(position - 1).getParent())){
            rlParent.setVisibility(VISIBLE);
            parentTextView.setText(goodsDetailBean.getParent());
        } else {
            rlParent.setVisibility(GONE);
        }
        nameTextView.setText(goodsDetailBean.getName());
    }
}
