package com.chengquan.fastrepairapp.fragment.repair;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.widget.repair.SkillsRecyclerView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * 工程师介绍
 */
public class EngineerIntroFragment extends Fragment {
    private SkillsRecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_engineer_intro, null);
        recyclerView = view.findViewById(R.id.recyclerview);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            list.add("设备维修" + i);
        }
        recyclerView.setAdapter(list);

        return view;
    }
}
