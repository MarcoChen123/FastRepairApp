package com.chengquan.fastrepairapp.widget.home;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.chengquan.fastrepairapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;

public class HomeSearchView extends FrameLayout {
    private String hintText;
    private boolean showScan;

    private EditText editText;
    private ImageView scanImageView;

    public HomeSearchView(@NonNull Context context) {
        super(context);
        init();
    }

    public HomeSearchView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initAttr(attrs);
        init();
    }

    public HomeSearchView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttr(attrs);
        init();
    }

    private void initAttr(AttributeSet attr){
        TypedArray typedArray = getContext().obtainStyledAttributes(attr, R.styleable.HomeSearchView);
        hintText = typedArray.getString(R.styleable.HomeSearchView_search_hint);
        showScan = typedArray.getBoolean(R.styleable.HomeSearchView_search_show_scan, true);
        typedArray.recycle();
    }

    private void init(){
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_home_search, null);
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        addView(view, params);

        editText = view.findViewById(R.id.editText);
        scanImageView = view.findViewById(R.id.iv_scan);

        if(!TextUtils.isEmpty(hintText)){
            editText.setHint(hintText);
        }
        scanImageView.setVisibility(showScan ? VISIBLE : GONE);
    }
}
