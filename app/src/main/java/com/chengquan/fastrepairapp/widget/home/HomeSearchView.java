package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.chengquan.fastrepairapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HomeSearchView extends FrameLayout {
    public HomeSearchView(@NonNull Context context) {
        super(context);
        init();
    }

    public HomeSearchView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HomeSearchView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_home_search, null);
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        addView(view, params);
    }
}
