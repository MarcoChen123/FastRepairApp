package com.chengquan.fastrepairapp.fragment.repair;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.bean.repair.CasePictureBean;
import com.chengquan.fastrepairapp.widget.repair.CasePictureRecyclerView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CasePictureFragment extends Fragment {
    private CasePictureRecyclerView casePictureRecyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_case, null);
        casePictureRecyclerView = view.findViewById(R.id.recyclerview);

        List<CasePictureBean> list = new ArrayList<>();
        list.add(new CasePictureBean());
        list.add(new CasePictureBean());
        list.add(new CasePictureBean());
        list.add(new CasePictureBean());
        list.add(new CasePictureBean());
        list.add(new CasePictureBean());
        casePictureRecyclerView.setAdapter(list);
        return view;
    }
}