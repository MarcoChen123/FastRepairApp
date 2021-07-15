package com.chengquan.fastrepairapp.fragment.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.publish.PublishRequirementActivity;
import com.chengquan.fastrepairapp.activity.publish.PublishSampleActivity;
import com.chengquan.fastrepairapp.activity.publish.PublishServiceActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomePublishFragment extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_publish,null);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick({R.id.rl_publish_sample, R.id.rl_publish_service, R.id.rl_publish_requirement})
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.rl_publish_sample:
                intent = new Intent(getActivity(), PublishSampleActivity.class);
                getActivity().startActivity(intent);
                break;

            case R.id.rl_publish_service:
                intent = new Intent(getActivity(), PublishServiceActivity.class);
                getActivity().startActivity(intent);
                break;

            case R.id.rl_publish_requirement:
                intent = new Intent(getActivity(), PublishRequirementActivity.class);
                getActivity().startActivity(intent);
                break;
        }
    }
}
