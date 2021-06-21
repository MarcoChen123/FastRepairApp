package com.chengquan.framework.baseactivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.chengquan.framework.R;
import com.chengquan.framework.util.DialogUtil;
import com.gyf.immersionbar.ImmersionBar;

import androidx.annotation.ColorRes;


/**
 * @author WuImmortalHalf
 * @version 3.0
 * @TODO 用于配置title
 * @date 创建时间：2016年9月6日 下午4:28:39 *
 */
public class BaseActivity extends Activity {
    protected Dialog mDialog;
    private FrameLayout mView;
    // 导航栏控件
    protected View mTitleBack;// 返回
    protected TextView mTitleText;// 标题
    protected TextView mTitleRight;// 右侧图标

    private void onCreates(Bundle savedInstanceState, int layoutRes, int frameRes) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setTranslucentStatus(R.color.blue_016DB6);
//		setTranslucentStatus();

        setContentView(frameRes);
        inflate(layoutRes);
        initTitle();
        findView();
        setListener();
        initData();
        setViewData();
    }

    private void onCreates(Bundle savedInstanceState, int layoutRes, String title, String rightText) {
        onCreates(savedInstanceState, layoutRes, R.layout.activity_base_with_title);
        mTitleText.setText(title);
        mTitleRight.setText(rightText);
    }

    protected void onCreate(Bundle savedInstanceState, int layoutRes, int titleRes) {
        onCreates(savedInstanceState, layoutRes, getString(titleRes), "");
    }

    protected void onCreate(Bundle savedInstanceState, int layoutRes, int titleRes, int rightRes) {
        onCreates(savedInstanceState, layoutRes, getString(titleRes), getString(rightRes));
    }

    protected void onCreate(Bundle savedInstanceState, int layoutRes, String title) {
        onCreates(savedInstanceState, layoutRes, title, "");
    }

    protected void onCreate(Bundle savedInstanceState, int layoutRes, String title, String righttext) {
        onCreates(savedInstanceState, layoutRes, title, righttext);
    }

    protected void onCreate(Bundle savedInstanceState, int layoutRes) {
        onCreates(savedInstanceState, layoutRes, R.layout.activity_base_without_title);
    }


    private void inflate(int layoutResID) {
        LayoutInflater inflater = getLayoutInflater();
        View contentView = inflater.inflate(layoutResID, null);
        mView = (FrameLayout) findViewById(R.id.content);
        mView.addView(contentView);
        findViewById(R.id.main_layout).setFitsSystemWindows(true);
    }

    protected void showDialog() {
        if (mDialog == null) {
            mDialog = DialogUtil.createLoadingDialog(this);
        }
        if (!mDialog.isShowing()) {
            mDialog.show();
        }
    }

    protected void dismissDialog() {
        if (mDialog != null && mDialog.isShowing()) {
            mDialog.dismiss();
        }
    }

    @SuppressLint("NewApi")
    public void setTranslucentStatus(@ColorRes int color) {// 沉浸标题栏效果
        ImmersionBar.with(this)
                .statusBarColor(color)
                .init();
    }

    private void initTitle() {
        // TODO Auto-generated method stub
        ViewGroup v = (ViewGroup) ((ViewGroup) findViewById(android.R.id.content))
                .getChildAt(0);
        if (v.getChildCount() < 1) {
            return;
        }

        try {
            if (findTitleViewGroup(v)) {
                if (v.findViewById(R.id.title_back) == null
                        || v.findViewById(R.id.title_tv) == null
                        || v.findViewById(R.id.title_right) == null) {
                    return;
                }

                mTitleBack = findViewById(R.id.title_back);
                mTitleText = (TextView) findViewById(R.id.title_tv);
                mTitleRight = (TextView) findViewById(R.id.title_right);

                mTitleBack.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        clickBack(v);
                    }
                });

                mTitleRight.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub
                        clickRightImage(v);
                    }
                });

                if (!TextUtils.isEmpty(getTitleString())) {
                    mTitleText.setText(getTitleString());
                }

                if (!TextUtils.isEmpty(getRightTitleString())) {
                    mTitleRight.setText(getRightTitleString());
                }

            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return;
        }

    }

    private boolean findTitleViewGroup(View v) {
        // TODO Auto-generated method stub
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            if (viewGroup.getChildCount() > 0) {
                if (viewGroup.findViewById(R.id.title_back) != null
                        && viewGroup.findViewById(R.id.title_tv) != null
                        && viewGroup.findViewById(R.id.title_right) != null) {
                    return true;
                } else {
                    for (int i = 0, j = viewGroup.getChildCount(); i < j; i++) {
                        if (findTitleViewGroup(viewGroup.getChildAt(i))) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    protected void findView() {

    }

    protected void setListener() {

    }

    protected void initData() {

    }

    protected void setViewData(){

    }

    protected void clickBack(View v) {
        finish();
    }

    protected void clickRightImage(View v) {

    }

    protected String getTitleString() {
        return "";
    }

    protected String getRightTitleString() {
        return "";
    }

    protected int getRightImageDrawId() {
        return 0;
    }

}
