package com.chengquan.fastrepairapp.activity.repairmall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.GoodsCategoryBean;
import com.chengquan.fastrepairapp.bean.GoodsDetailBean;
import com.chengquan.fastrepairapp.bean.SuggestEngineerBean;
import com.chengquan.fastrepairapp.widget.CategoryRecyclerView;
import com.chengquan.fastrepairapp.widget.GoodsCategoryRecyclerView;
import com.chengquan.fastrepairapp.widget.GoodsDetailRecyclerView;
import com.chengquan.fastrepairapp.widget.HotBrandRecyclerView;
import com.chengquan.fastrepairapp.widget.SuggestEngineerRecyclerView;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.chengquan.framework.view.BaseRecyclerView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EngineerSearchActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.recyclerview)
    CategoryRecyclerView catgoryRecyclerView;
    @BindView(R.id.recyclerview_suggest)
    SuggestEngineerRecyclerView suggestEngineerRecyclerView;
    @BindView(R.id.recyclerview_hot_brand)
    HotBrandRecyclerView hotBrandRecyclerView;
    @BindView(R.id.recyclerview_goods_category)
    GoodsCategoryRecyclerView goodsCategoryRecyclerView;
    @BindView(R.id.recyclerview_goods_detail)
    GoodsDetailRecyclerView goodsDetailRecyclerView;
    @BindView(R.id.ll_search_goods)
    LinearLayout searchGoodsLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_engineer_search, "工程师查询");
    }

    @Override
    protected void findView() {
        super.findView();
        ButterKnife.bind(this);
    }

    @Override
    protected void setListener() {
        super.setListener();
        catgoryRecyclerView.setOnItemClickListener(new BaseRecyclerView.OnItemClickListener<String>() {
            @Override
            public void onItemClick(String data, int position) {
                catgoryRecyclerView.setSelectCatgory(data);
            }
        });

        suggestEngineerRecyclerView.setOnItemClickListener(new BaseRecyclerView.OnItemClickListener<SuggestEngineerBean>() {
            @Override
            public void onItemClick(SuggestEngineerBean data, int position) {
                Intent intent = new Intent(EngineerSearchActivity.this, CompanyDataActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        List<String> list = new ArrayList<>();
        list.add("维修");
        list.add("故障排查/处理");
        list.add("上门检修");
        list.add("远程交机");
        list.add("调试/送电");
        list.add("维修保养");
        list.add("升级/更换");
        list.add("装配/组立");
        list.add("大修/改造");
        list.add("设计/开发");
        catgoryRecyclerView.setAdapter(list);

        List<SuggestEngineerBean> list2 = new ArrayList<>();
        list2.add(new SuggestEngineerBean());
        list2.add(new SuggestEngineerBean());
        list2.add(new SuggestEngineerBean());
        suggestEngineerRecyclerView.setAdapter(list2);

        List<Integer> brandList = new ArrayList<>();
        brandList.add(R.drawable.ic_brand1);
        brandList.add(R.drawable.ic_brand2);
        brandList.add(R.drawable.ic_brand3);
        brandList.add(R.drawable.ic_brand4);
        brandList.add(R.drawable.ic_brand5);
        brandList.add(R.drawable.ic_brand6);
        hotBrandRecyclerView.setAdapter(brandList);

        List<GoodsCategoryBean> goodsCategoryBeans = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            GoodsCategoryBean bean = new GoodsCategoryBean();
            bean.setName("数控系统" + i);
            goodsCategoryBeans.add(bean);
        }
        goodsCategoryRecyclerView.setAdapter(goodsCategoryBeans);

        List<GoodsDetailBean> goodsDetailBeans = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            GoodsDetailBean bean = new GoodsDetailBean();
            bean.setParent("富士PLC");
            bean.setName("富士PLC  " + i);
            goodsDetailBeans.add(bean);
        }

        for (int i = 0; i < 5; i++) {
            GoodsDetailBean bean = new GoodsDetailBean();
            bean.setParent("西门子PLC");
            bean.setName("西门子PLC  " + i);
            goodsDetailBeans.add(bean);
        }
        goodsDetailRecyclerView.setAdapter(goodsDetailBeans);
    }

    private void setCategoryVisiblility(){
        if(searchGoodsLayout.getVisibility() == View.VISIBLE){
            searchGoodsLayout.setVisibility(View.GONE);
        } else {
            searchGoodsLayout.setVisibility(View.VISIBLE);
        }
    }


    @OnClick({R.id.rl_recruit_engineer, R.id.rl_submit_order, R.id.iv_catgory})
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.rl_recruit_engineer:
                intent = new Intent(EngineerSearchActivity.this, RecruitEngineerActivity.class);
                startActivity(intent);
                break;

            case R.id.rl_submit_order:
                intent = new Intent(EngineerSearchActivity.this, SubmitOrderActivity.class);
                startActivity(intent);
                break;

            case R.id.iv_catgory:
                setCategoryVisiblility();
                break;
        }
    }
}
