package com.chengquan.framework.view;

import android.util.SparseArray;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class BaseViewHolder extends RecyclerView.ViewHolder {
    private SparseArray<View> mViews;
    private View mContentView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mContentView = itemView;
        mViews = new SparseArray<>();
    }

    public static BaseViewHolder createViewHolder(View itemView){
        return new BaseViewHolder(itemView);
    }

    public <T extends View> T findView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = mContentView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

}
