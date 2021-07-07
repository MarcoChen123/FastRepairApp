package com.chengquan.fastrepairapp.widget.repair;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.chengquan.fastrepairapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class LabelCheckbox extends FrameLayout implements CompoundButton.OnCheckedChangeListener {
    private String checkboxText;
    private float checkboxTextSize, checkboxPaddingTop, checkboxPaddingBottom, checkboxPaddingLeft, checkboxPaddingRight;
    private int checkboxBackground;
    private int checkboxTextColor;
    private boolean checkboxIsChecked;
    private CompoundButton.OnCheckedChangeListener mListener;

    private CheckBox checkBox;
    private ImageView ivLabel;

    public LabelCheckbox(@NonNull Context context) {
        super(context);
        init();
    }

    public LabelCheckbox(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initAttr(attrs);
        init();
    }

    public LabelCheckbox(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAttr(attrs);
        init();
    }

    public void setOnCheckChangedListener(CompoundButton.OnCheckedChangeListener listener){
        mListener = listener;
    }

    private void initAttr(AttributeSet attr){
        TypedArray typedArray = getContext().obtainStyledAttributes(attr, R.styleable.LabelCheckbox);
        checkboxText = typedArray.getString(R.styleable.LabelCheckbox_checkbox_text);
        checkboxTextSize = typedArray.getDimensionPixelSize(R.styleable.LabelCheckbox_checkbox_textSize, 12);
        checkboxPaddingTop = typedArray.getDimension(R.styleable.LabelCheckbox_checkbox_paddingTop, 0);
        checkboxPaddingBottom = typedArray.getDimension(R.styleable.LabelCheckbox_checkbox_paddingBottom, 0);
        checkboxPaddingLeft = typedArray.getDimension(R.styleable.LabelCheckbox_checkbox_paddingLeft, 0);
        checkboxPaddingRight = typedArray.getDimension(R.styleable.LabelCheckbox_checkbox_paddingRight, 0);
        checkboxBackground = typedArray.getResourceId(R.styleable.LabelCheckbox_checkbox_background, R.drawable.selector_order_checkbox);
        checkboxTextColor = typedArray.getColor(R.styleable.LabelCheckbox_checkbox_textColor, getResources().getColor(R.color.black));
        checkboxIsChecked = typedArray.getBoolean(R.styleable.LabelCheckbox_checkbox_checked, false);
        typedArray.recycle();
    }

    private void init(){
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_label_checkbox, null);
        checkBox = view.findViewById(R.id.checkbox);
        ivLabel = view.findViewById(R.id.iv_label);

        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        addView(view, params);

        if(!TextUtils.isEmpty(checkboxText)) {
            checkBox.setText(checkboxText);
        }
        checkBox.setBackgroundResource(checkboxBackground);
//        checkBox.setTextColor(checkboxTextColor);
        checkBox.setPadding((int)checkboxPaddingLeft, (int)checkboxPaddingTop, (int)checkboxPaddingRight, (int)checkboxPaddingBottom);
        checkBox.setOnCheckedChangeListener(this);
        checkBox.setChecked(checkboxIsChecked);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(ivLabel != null) {
            ivLabel.setVisibility(isChecked ? VISIBLE : GONE);
        }
        if(mListener != null){
            mListener.onCheckedChanged(buttonView, isChecked);
        }
    }

    public void setText(String text){
        if(checkBox != null){
            checkBox.setText(text);
        }
    }

    public void setEnable(boolean is){
        if(checkBox != null){
            checkBox.setEnabled(is);
            checkBox.setFocusable(is);
        }
    }
}
