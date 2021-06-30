package com.chengquan.fastrepairapp.activity.repairmall;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.qmuiteam.qmui.alpha.QMUIAlphaViewHelper;
import com.qmuiteam.qmui.util.QMUIDeviceHelper;
import com.qmuiteam.qmui.util.QMUIDisplayHelper;

import androidx.annotation.Nullable;
import butterknife.BindView;

/**
 * 招募工程师
 */
public class RecruitEngineerActivity extends BaseActivity {

    @BindView(R.id.iv_ad)
    ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_recruit_engineer, "招募工程师");
    }

    @Override
    protected void setViewData() {
        super.setViewData();
        setImageWH();
    }

    private void setImageWH(){
        int screenWidth = QMUIDisplayHelper.getScreenWidth(this);
        int height = screenWidth * 380 / 750;
        ViewGroup.LayoutParams params = imageView.getLayoutParams();
        params.height = height;
        imageView.setLayoutParams(params);
    }
}
