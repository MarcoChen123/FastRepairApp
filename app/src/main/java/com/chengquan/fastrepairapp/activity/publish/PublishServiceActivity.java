package com.chengquan.fastrepairapp.activity.publish;

import android.content.Intent;
import android.os.Bundle;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.widget.ImagePickLayout;
import com.chengquan.framework.baseactivity.BaseActivity;

import androidx.annotation.Nullable;
import butterknife.BindView;

public class PublishServiceActivity extends BaseActivity {
    @BindView(R.id.imagePickLayout)
    ImagePickLayout imagePickLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_publish_service, "维护");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        imagePickLayout.onActivityResult(requestCode, resultCode, data);
    }
}
