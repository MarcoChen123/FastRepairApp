package com.chengquan.fastrepairapp.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.home.MeMenuBean;
import com.chengquan.fastrepairapp.widget.GridDividerItemDecoration;
import com.chengquan.fastrepairapp.widget.home.MeMenuRecyclerView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MePageFragment extends Fragment implements View.OnClickListener {
    @BindView(R.id.iv_photo)
    AppCompatImageView ivPhoto;
    @BindView(R.id.tv_account)
    TextView tvAccount;
    @BindView(R.id.tv_waitServerNum)
    TextView tvWaitServerNum;
    @BindView(R.id.tv_inServerNum)
    TextView tvInServerNum;
    @BindView(R.id.tv_waitAppraiseNum)
    TextView tvWaitAppraiseNum;
    @BindView(R.id.recyclerview_me_menu)
    MeMenuRecyclerView recyclerviewMeMenu;

//
//    private HomePagePresenter mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        mPresenter = new HomePagePresenter();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_me, null);
        ButterKnife.bind(this, view);


        GridDividerItemDecoration gridDividerItemDecoration = new GridDividerItemDecoration(2, ContextCompat.getColor(getActivity(), R.color.gray_f4f4f4));//四周都有分割线
        recyclerviewMeMenu.addItemDecoration(gridDividerItemDecoration);

        recyclerviewMeMenu.setAdapter(MeMenuBean.getMenus());
        return view;
    }


    @Override
    public void onClick(View v) {

    }

}
