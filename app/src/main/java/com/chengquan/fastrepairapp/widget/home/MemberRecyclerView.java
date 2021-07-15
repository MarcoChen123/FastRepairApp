package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.HomeDataBean;
import com.chengquan.framework.view.BaseRecyclerView;
import com.chengquan.framework.view.BaseViewHolder;

import androidx.annotation.Nullable;

public class MemberRecyclerView extends BaseRecyclerView<HomeDataBean.MemberListBean> {
    public MemberRecyclerView(Context context) {
        super(context);
    }

    public MemberRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MemberRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected int getItemLayout() {
        return R.layout.item_home_member;
    }

    @Override
    protected void setViewData(BaseViewHolder holder, HomeDataBean.MemberListBean memberListBean, int position) {
        TextView tvName = holder.findView(R.id.tv_name);
        String text = String.format("恭喜【%s】入驻成功", memberListBean.getCompanyName());
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF581D")), text.indexOf("【"), text.indexOf("】") + 1, 0);
        tvName.setText(spannableString);

    }
}
