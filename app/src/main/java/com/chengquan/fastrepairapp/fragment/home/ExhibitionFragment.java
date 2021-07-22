package com.chengquan.fastrepairapp.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.DataBean;
import com.chengquan.fastrepairapp.bean.home.ExhibitionNewsBean;
import com.chengquan.fastrepairapp.bean.home.ExhibitionScheduleBean;
import com.chengquan.fastrepairapp.widget.exhibition.ExhibitionNewsRecyclerView;
import com.chengquan.fastrepairapp.widget.exhibition.ExhibitionScheduleRecyclerView;
import com.chengquan.fastrepairapp.widget.exhibition.HorizontalItemDecoration;
import com.chengquan.framework.view.BaseRecyclerView;
import com.lzy.imagepicker.view.GridSpacingItemDecoration;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class ExhibitionFragment extends Fragment {
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.recycler_exhibition_news)
    ExhibitionNewsRecyclerView exhibitionNewsRecyclerView;
    @BindView(R.id.recycler_exhibition_schedule)
    ExhibitionScheduleRecyclerView exhibitionScheduleRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exhibition, null);
        ButterKnife.bind(this, view);

        initBanner();
        initExhibitionNews();
        initExhibitionSchedule();
        return view;
    }


    private void initBanner(){
        ImageNetAdapter imageNetAdapter = new ImageNetAdapter(DataBean.getTestData(), false);
        CircleIndicator circleIndicator = new CircleIndicator(getContext());
        banner.setAdapter(imageNetAdapter)
                .addBannerLifecycleObserver(this)
                .setIndicator(circleIndicator)
                .setIndicatorNormalColor(getResources().getColor(R.color.white))
                .setIndicatorSelectedColor(getResources().getColor(R.color.banner_select));
    }

    private void initExhibitionNews(){
        List<ExhibitionNewsBean> list = new ArrayList<>();
        list.add(new ExhibitionNewsBean());
        list.add(new ExhibitionNewsBean());
        list.add(new ExhibitionNewsBean());
        list.add(new ExhibitionNewsBean());
        list.add(new ExhibitionNewsBean());
        exhibitionNewsRecyclerView.addItemDecoration(new HorizontalItemDecoration(12, getActivity()));
        exhibitionNewsRecyclerView.setAdapter(list);
    }

    private void initExhibitionSchedule(){
        List<ExhibitionScheduleBean> list = new ArrayList<>();
        list.add(new ExhibitionScheduleBean());
        list.add(new ExhibitionScheduleBean());
        list.add(new ExhibitionScheduleBean());
        list.add(new ExhibitionScheduleBean());
        list.add(new ExhibitionScheduleBean());
        exhibitionScheduleRecyclerView.setAdapter(list);
        View footerView = getLayoutInflater().inflate(R.layout.footer_load_more, null);
        exhibitionScheduleRecyclerView.addFooterView(footerView);
    }
}
