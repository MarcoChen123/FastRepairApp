package com.chengquan.framework.util;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.chengquan.framework.R;
import com.chengquan.framework.impl.OnDialogClickListener;


public class DialogUtil {

	/**
	 * 得到自定义的progressDialog
	 * 
	 * @param context
	 * @return
	 */
	// public static Dialog createLoadingDialog(Context context, String msg) {
	//
	// // 首先得到整个View
	// View view = LayoutInflater.from(context).inflate(
	// R.layout.loading_dialog_view, null);
	// // 获取整个布局
	// LinearLayout layout = (LinearLayout) view
	// .findViewById(R.id.dialog_view);
	// // 页面中的Img
	// ImageView img = (ImageView) view.findViewById(R.id.img);
	//
	// // 加载动画，动画用户使img图片不停的旋转
	// Animation animation = AnimationUtils.loadAnimation(context,
	// R.anim.dialog_load_animation);
	// // 显示动画
	// img.startAnimation(animation);
	//
	// // 创建自定义样式的Dialog
	// Dialog loadingDialog = new Dialog(context, R.style.loading_dialog);
	// loadingDialog.setCancelable(false);
	// loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
	// LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	//
	// return loadingDialog;
	// }

	// public static Dialog createLoadingDialog(Context context) {
	//
	// // 首先得到整个View
	// View view = LayoutInflater.from(context).inflate(
	// R.layout.loading_gif, null);
	// // 获取整个布局
	// LinearLayout layout = (LinearLayout) view
	// .findViewById(R.id.dialog_view);
	// GifView gif = (GifView) view.findViewById(R.id.gif);
	//
	// gif.setMovieResource(R.raw.loading);
	//
	// // 创建自定义样式的Dialog
	// Dialog loadingDialog = new Dialog(context, R.style.loading_gif);
	// loadingDialog.setCancelable(false);
	// loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
	// LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
	//
	// return loadingDialog;
	// }

	public static Dialog createLoadingDialog(Context context) {

		// 首先得到整个View
		View view = LayoutInflater.from(context).inflate(
				R.layout.loading_dialog_view, null);
		// 获取整个布局
		LinearLayout layout = (LinearLayout) view
				.findViewById(R.id.dialog_view);
		// 页面中的Img
		ImageView img = (ImageView) view.findViewById(R.id.img);

		// 加载动画，动画用户使img图片不停的旋转
		Animation animation = AnimationUtils.loadAnimation(context,
				R.anim.dialog_load_animation);
		// 显示动画
		img.startAnimation(animation);

		// 创建自定义样式的Dialog
		Dialog loadingDialog = new Dialog(context, R.style.loading_dialog);
		loadingDialog.setCancelable(false);
		loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

		Window window = loadingDialog.getWindow();

		// window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
		// WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);// 不获得焦点
		window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);// 背景不变暗
		window.setGravity(Gravity.CENTER);// 位于屏幕中间
		return loadingDialog;
	}
	
	public static Dialog createLoadingDialog(Context context, String textStr) {

		// 首先得到整个View
		View view = LayoutInflater.from(context).inflate(
				R.layout.loading_text_dialog_view, null);
		// 获取整个布局
		LinearLayout layout = (LinearLayout) view
				.findViewById(R.id.dialog_view);
		// 页面中的Img
		ImageView img = (ImageView) view.findViewById(R.id.img);
		TextView text = (TextView) view.findViewById(R.id.text);

		// 加载动画，动画用户使img图片不停的旋转
		Animation animation = AnimationUtils.loadAnimation(context,
				R.anim.dialog_load_animation);
		// 显示动画
		img.startAnimation(animation);
		text.setText(textStr);

		// 创建自定义样式的Dialog
		Dialog loadingDialog = new Dialog(context, R.style.loading_dialog);
		loadingDialog.setCancelable(false);
		loadingDialog.setContentView(layout, new LinearLayout.LayoutParams(
				LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));

		Window window = loadingDialog.getWindow();

		// window.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
		// WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL);// 不获得焦点
		window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);// 背景不变暗
		window.setGravity(Gravity.CENTER);// 位于屏幕中间
		return loadingDialog;
	}

	public static Dialog createInfoDialog(Context context, String text,
                                          final OnDialogClickListener listener) {

		// 首先得到整个View
		View view = LayoutInflater.from(context).inflate(
				R.layout.info_dialog_view, null);

		// 创建自定义样式的Dialog
		final Dialog inputDialog = new Dialog(context, R.style.loading_dialog);
		inputDialog.setTitle("创建主题");
		inputDialog.setCancelable(false);
		inputDialog.setContentView(view, new LinearLayout.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

		Button btn_determine = (Button) view.findViewById(R.id.btn_determine);
		TextView tv = (TextView) view.findViewById(R.id.tv);

		tv.setText(text);

		btn_determine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (listener != null) {
					listener.onDetermine();
				}
				inputDialog.dismiss();
			}
		});

		return inputDialog;
	}

	public static Dialog createToastDialog(Context context, String text,
                                           final OnDialogClickListener listener) {

		// 首先得到整个View
		View view = LayoutInflater.from(context).inflate(
				R.layout.notice_dialog_view, null);

		// 创建自定义样式的Dialog
		final Dialog inputDialog = new Dialog(context, R.style.loading_dialog);
		inputDialog.setTitle("创建主题");
		inputDialog.setCancelable(false);
		inputDialog.setContentView(view, new LinearLayout.LayoutParams(
				LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));

		Button btn_determine = (Button) view.findViewById(R.id.btn_determine);
		Button btn_cancel = (Button) view.findViewById(R.id.btn_cancel);
		TextView tv = (TextView) view.findViewById(R.id.tv);

		tv.setText(text);

		btn_determine.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				listener.onDetermine();
				inputDialog.dismiss();
			}
		});

		btn_cancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				inputDialog.dismiss();
			}
		});

		return inputDialog;
	}



}
