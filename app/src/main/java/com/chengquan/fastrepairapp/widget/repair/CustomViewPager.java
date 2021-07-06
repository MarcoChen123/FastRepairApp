package com.chengquan.fastrepairapp.widget.repair;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import java.util.HashMap;
import java.util.Map;

import androidx.viewpager.widget.ViewPager;

public class CustomViewPager extends ViewPager {
    private Map<Integer, View> map = new HashMap<>(4);
    private int currentPage;
    int height = 0;

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    /**
     * 作者：GaoXX
     * 创建时间:2017/11/8
     * 注释描述:测量高度
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (map.size() > currentPage) {
            View view = map.get(currentPage);//获取当前视图的view
            view.measure(widthMeasureSpec,MeasureSpec.makeMeasureSpec(0,MeasureSpec.UNSPECIFIED));//测量当前view的宽高，高度就是测量的实际大小值
            height = view.getMeasuredHeight();//获取测试的高度
        }

        heightMeasureSpec = MeasureSpec.makeMeasureSpec(height,MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


    /**
     * 作者：GaoXX
     * 创建时间:2017/11/8
     * 注释描述:在切换tab的时候，重置ViewPager的高度
     */
    public void resetHeight(int current) {
        this.currentPage = current;//获取切换的tab
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) getLayoutParams();
        setLayoutParams(params);//会重新刷新onMeasure方法
    }

    /**
     * 获取、存储每一个tab的高度，在需要的时候显示存储的高度
     *
     * @param current tab的position
     * @param view    当前tab的高度
     */
    public void addHeight(int current, View view) {
        map.put(current, view);
    }
}
