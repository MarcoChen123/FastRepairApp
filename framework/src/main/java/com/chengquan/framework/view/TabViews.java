package com.chengquan.framework.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chengquan.framework.R;

import java.util.ArrayList;
import java.util.List;


/**
 * 这是自定义的Tab工具栏类,主要实现工具栏的选项等<br/>
 * 添加自定义图标{@link #mDrawableIds} <br/>
 * 设置工具栏选项文字{@link #TabViews(Context, AttributeSet, int)}<br/>
 * 初始化Tab选项{@link #init(Context)}
 * 
 * @author NapoleonBai
 *
 */
public class TabViews extends LinearLayout {
	/** 这是每个选项所需要的图标 */
	private int[] mDrawableIds = new int[] { R.drawable.dialog_load_bg,
			R.drawable.dialog_load_bg, R.drawable.dialog_load_bg};
	/** 存放底部菜单的各个文字CheckedTextView */
	private List<CheckedTextView> mCheckedList = new ArrayList<CheckedTextView>();
	/** 存放底部菜单每项View */
	private List<View> mViewList = new ArrayList<View>();
	/** 存放信息提示TextView */
	private List<TextView> mTextViewList = new ArrayList<TextView>();
	/** 底部菜单的文字数组 */
	private CharSequence[] mLabels;
	
	/**
	 * 
	 * 重写这个方法,主要是因为它提供了更多的参数设置
	 * 
	 * @param context
	 * @param attrs
	 * @param defStyle
	 *            可以借此来访问自定义属性
	 */
	@SuppressLint("NewApi")
	public TabViews(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// 获取TypedArray对象,用来获取自定义属性
		TypedArray mTypedArray = context.obtainStyledAttributes(attrs,
				R.styleable.TabViews, defStyle, 0);

		// 读取XML中，各个tab使用的文字
		mLabels = mTypedArray.getTextArray(R.styleable.TabViews_bottom_labels);

		// 说明没有通过自定义属性设置显示文字
		if (mLabels.length <= 0 || mLabels == null) {
			mTypedArray.recycle();
			return;
		}
		
		// 释放资源
		mTypedArray.recycle();

		init(context);
		
	}

	public TabViews(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	/**
	 * 重写这个方法,调用初始化控件方法
	 * 
	 * @param context
	 */
	public TabViews(Context context) {
		super(context);
		init(context);
		
	}

	/**
	 * 初始化控件
	 * 
	 * @param context
	 *            应用上下文对象
	 */
	private void init(final Context context) {
		// 设置为水平布局方式
		this.setOrientation(LinearLayout.HORIZONTAL);
		// 设置背景颜色(图片)
		this.setBackgroundColor(Color.WHITE);
		// 得到inflater对象,主要用于导入布局
		LayoutInflater inflater = LayoutInflater.from(context);
		// 设置布局参数
		LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0,
				LayoutParams.MATCH_PARENT);
		// 设置权重
		params.weight = 1.0f;
		// 设置内容居中
		params.gravity = Gravity.CENTER;
		// 得到一共有多少个选项
		int size = mLabels.length;
		for (int i = 0; i < size; i++) {
			// 这是每个item的下标
			final int index = i;

			// 每个tab对应的layout
			final View view = inflater.inflate(R.layout.tab_item, null);
			
			// 得到item的title和图标控件
			final CheckedTextView itemName = (CheckedTextView) view
					.findViewById(R.id.ctv_tab_item_title);
			
			// 设置图标(这里设置的是上面的图标)
//			itemName.setCompoundDrawablesWithIntrinsicBounds(null, context
//					.getResources().getDrawable(mDrawableIds[i]), null, null);
			Drawable mDrawable = context
					.getResources().getDrawable(mDrawableIds[i]);
			mDrawable.setBounds(
					0, 
					0,
					(int)context.getResources().getDimension(R.dimen.y60),
					(int)context.getResources().getDimension(R.dimen.y60)); 
			itemName.setCompoundDrawables(null, mDrawable, null, null);
			// 设置显示文字
			itemName.setText(mLabels[i]);
			// 信息提示TextView，如有信息需要显示
			final TextView indicateTextView = (TextView) view
					.findViewById(R.id.tv_tab_msg);
			// 添加到布局中
			this.addView(view, params);

			// CheckedTextView设置索引作为tag，以便后续更改颜色、图片等
			itemName.setTag(index);
			indicateTextView.setTag(index);

			// 将CheckedTextView添加到list中，便于操作
			mCheckedList.add(itemName);
			// 将信息提示视图加到list，便于控制显示隐藏
			mTextViewList.add(indicateTextView);
			// 将各个tab的View添加到list
			mViewList.add(view);

			view.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View v) {

					// 设置底部图片和文字的显示
					setTabsDisplay(context, index);
					if (isHide) {
						TextView mTextView = mTextViewList.get(index);
						mTextView.setVisibility(View.GONE);
					}
					if (null != mTabListener) {
						// tab项被选中的回调事件
						mTabListener.onTabSelected(index);
					}
				}
			});

			// 初始化 底部菜单选中状态,默认第一个选中
			if (i == 0) {
				itemName.setChecked(true);
				// 这个是item的背景
				view.setBackgroundColor(Color.rgb(240, 241, 242));
			} else {
				itemName.setChecked(false);
				view.setBackgroundColor(Color.rgb(250, 250, 250));
			}
		}
	}
	
	
	/**  
		* @TODO 选中指定下标
	 	* @author WuImmortalHalf
		* @date 创建时间：2016年6月28日 下午2:51:38 * 
	 	* @param index  下标0-4
	 */    
	public void setPitchIndex(int index) {
		
		if (index > getChildCount() || index<0) {
			return;
		}
		
		View v = getChildAt(index);
		
		v.performClick();
		
	}
	

	/**
	 * 决定是否点击选项就隐藏消息图标
	 * 
	 */
	public void registerTabClickHideMSG(boolean hide) {
		isHide = hide;
	}

	private static boolean isHide = false;

	/**
	 * 设置底部导航中是否选中的item的背景颜色
	 */
	public void setTabsDisplay(Context context, int index) {
		int size = mCheckedList.size();
		for (int i = 0; i < size; i++) {
			CheckedTextView checkedTextView = mCheckedList.get(i);
			if ((Integer) (checkedTextView.getTag()) == index) {
				checkedTextView.setChecked(true);
				mViewList.get(i).setBackgroundColor(Color.rgb(240, 241, 242));
			} else {
				checkedTextView.setChecked(false);
				mViewList.get(i).setBackgroundColor(Color.rgb(250, 250, 250));
			}
		}
	}

	/**
	 * 设置信息显示
	 * 
	 * @param indexTag
	 *            下标tag值
	 * @param msgNumber 聊天条数
	 */
	public void setMSG(int indexTag, long msgNumber) {
		// 说明tag值存在
		if (mTextViewList.size() > indexTag) {
			TextView mTextView = mTextViewList.get(indexTag);
			if (msgNumber > 0) {
				mTextView.setVisibility(View.VISIBLE);
//				mTextView.setText("" + (msgNumber > 99 ? "99+" : msgNumber));
			} else {
				mTextView.setVisibility(View.GONE);
			}

		}
	}


	// 回调接口，用于获取tab的选中状态
	private OnTabSelectedListener mTabListener;

	/**
	 * 此接口用于回调选中item参数
	 * 
	 * @author NapoleonBai
	 *
	 */
	public interface OnTabSelectedListener {
		
		void onTabSelected(int index);
		
	}

	/**
	 * 设置回调接口
	 * 
	 * @param listener
	 */
	public void setOnTabSelectedListener(OnTabSelectedListener listener) {
		
		this.mTabListener = listener;
		
	}

}
