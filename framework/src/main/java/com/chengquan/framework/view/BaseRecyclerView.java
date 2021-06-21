package com.chengquan.framework.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class BaseRecyclerView<T> extends RecyclerView {
    protected static final int LAYOUT_GRID = 1;
    protected static final int LAYOUT_LIST = 2;

    private static final int TYPE_HEAD = 1;
    private static final int TYPE_FOOT = 2;

    private List<T> mList;
    protected MyAdapter mAdapter;
    protected OnItemClickListener<T> onItemClickListener;

    private ArrayList<View> mHeadView = new ArrayList<>();
    private ArrayList<View> mFootView = new ArrayList<>();

    public BaseRecyclerView(Context context) {
        super(context);
    }

    public BaseRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setOnItemClickListener(OnItemClickListener<T> listener){
        onItemClickListener = listener;
    }

    @LayoutRes
    protected abstract int getItemLayout();

    protected int getLayoutType() {
        return LAYOUT_LIST;
    }

    protected int getOriention(){
        return RecyclerView.VERTICAL;
    }

    protected int getLayoutColumn() {
        return 3;
    }

    protected T getItem(int position) {
        return mList.get(position - getHeadCount());
    }

    public int getItemCount(){
        if(mAdapter != null) return mAdapter.getItemCount();
        return 0;
    }

    protected abstract void setViewData(BaseViewHolder holder, T t, int position);

    public void addHeaderView(View headerView) {
        mHeadView.add(headerView);
        notifyDataSetChanged();
    }

    public void addFooterView(View footerView) {
        mFootView.add(footerView);
        notifyDataSetChanged();
    }

    public void removeFooterView(){
        mFootView.clear();
        notifyDataSetChanged();
    }

    public void notifyDataSetChanged() {
        if (mAdapter != null) mAdapter.notifyDataSetChanged();
    }

    public void addData(T t){
        if(mList == null){
            mList = new ArrayList<>();
        }
        mList.add(t);
    }

    public void addData(int position, T t) {
        if(mList == null){
            mList = new ArrayList<>();
        }
        mList.add(position, t);
        if(position != mAdapter.getItemCount()){
            mAdapter.notifyItemRangeChanged(position, mAdapter.getItemCount() - position);
        }
    }

    public void removeData(T t){
        if(mList != null){
            mList .remove(t);
        }

    }

    public void notifyInsert(int position){
        if(mAdapter != null){
            mAdapter.notifyItemInserted(position);
        }
    }

    public void notifyRemove(int position){
        if(mAdapter != null){
            mAdapter.notifyItemRemoved(position);

            if(position != mAdapter.getItemCount()){
                mAdapter.notifyItemRangeChanged(position, mAdapter.getItemCount() - position);
            }
        }
    }

    public void setAdapter(List<T> list) {
        mList = list;
        if (mList == null) {
            mList = new ArrayList<>();
        }
        if (mAdapter == null) {
            mAdapter = new MyAdapter();
            if (getLayoutType() == LAYOUT_GRID) {
                setLayoutManager(new GridLayoutManager(getContext(), getLayoutColumn()));
            } else {
                setLayoutManager(new LinearLayoutManager(getContext(), getOriention(), false));
            }
            setAdapter(mAdapter);
        } else {
            mAdapter.notifyDataSetChanged();
        }

    }

    protected List<T> getData() {
        return mList;
    }

    private int getFootCount() {
        return mFootView.size();
    }

    public int getHeadCount() {
        return mHeadView.size();
    }

    public class MyAdapter extends Adapter<BaseViewHolder> {

        @Override
        public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            if (viewType == TYPE_HEAD) {
                return new HeadViewHolder(mHeadView.get(0));
            } else if (viewType == TYPE_FOOT) {
                return new HeadViewHolder(mFootView.get(0));
            }
            View itemView = LayoutInflater.from(parent.getContext()).inflate(getItemLayout(), parent, false);
            return BaseViewHolder.createViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(BaseViewHolder holder, int position) {
            int headcount = getHeadCount();
            if (position < headcount) {
                return;
            }
            if(position >= headcount + mList.size()){
                return;
            }
            final int midPosition = position - headcount;
            int itemcount = getItemCount();
            if (midPosition < itemcount) {
                //暴露出去自由操作,传入的是调整后的位置，而不是算上头角的位置
//                mAdapter.onBindViewHolder(holder, position);
                holder.itemView.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (onItemClickListener != null){
                            onItemClickListener.onItemClick(mList.get(midPosition), midPosition);
                        }
                    }
                });
                setViewData(holder, mList.get(midPosition), midPosition);
                return;
            }


        }

        @Override
        public int getItemCount() {
            return mList == null ? getHeadCount() + getFootCount() : getHeadCount() + getFootCount() + mList.size();
        }

        @Override
        public int getItemViewType(int position) {
            int headcount = getHeadCount();
            //返回头部
            if (position < headcount) {
                //返回头部类型，
                return TYPE_HEAD;
            }
            final int midPosition = position - headcount;
            int itemCount = mList.size();
            if (midPosition < itemCount) {
                return super.getItemViewType(position);
            }

            //Footer类型
            return TYPE_FOOT;

        }
    }

    class HeadViewHolder extends BaseViewHolder {

        public HeadViewHolder(View itemView) {
            super(itemView);
        }
    }

    public interface OnItemClickListener<S> {
        void onItemClick(S data, int position);
    }
}
