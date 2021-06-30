package com.chengquan.framework.application;

import android.app.Application;
import android.content.Context;

import com.chengquan.framework.crashhandler.CrashHandler;
import com.chengquan.framework.imagepicker.GlideImageLoader;
import com.chengquan.framework.receiver.ActivityLifeUtil;
import com.lzy.imagepicker.ImagePicker;
import com.lzy.imagepicker.view.CropImageView;


public class MainApplication extends Application {

	// 全局Context
	private static Context mContext;

	private static MainApplication mMainApplication;

	@Override
	public void onCreate() {
		super.onCreate();
		mMainApplication = this;
		mContext = getApplicationContext();
		registerActivityLifecycleCallbacks(new ActivityLifeUtil());

        Thread.setDefaultUncaughtExceptionHandler(CrashHandler.getInstance());

        initImagePicker();

	}

	/**
	 * 获取全局Context
	 * 
	 * @return
	 */
	public static Context getContext() {
		return mContext;
	}

	/**
	 * 得到MainApplication对象
	 * 
	 * @return
	 */
	public static synchronized MainApplication getInstance() {
		return mMainApplication;
	}

	private void initImagePicker(){
		ImagePicker imagePicker = ImagePicker.getInstance();
		imagePicker.setImageLoader(new GlideImageLoader());   //设置图片加载器
		imagePicker.setShowCamera(true);  //显示拍照按钮
		imagePicker.setCrop(false);        //允许裁剪（单选才有效）
		imagePicker.setSaveRectangle(true); //是否按矩形区域保存
		imagePicker.setSelectLimit(9);    //选中数量限制
		imagePicker.setStyle(CropImageView.Style.RECTANGLE);  //裁剪框的形状
		imagePicker.setFocusWidth(800);   //裁剪框的宽度。单位像素（圆形自动取宽高最小值）
		imagePicker.setFocusHeight(800);  //裁剪框的高度。单位像素（圆形自动取宽高最小值）
		imagePicker.setOutPutX(1000);//保存文件的宽度。单位像素
		imagePicker.setOutPutY(1000);//保存文件的高度。单位像素
	}

}
