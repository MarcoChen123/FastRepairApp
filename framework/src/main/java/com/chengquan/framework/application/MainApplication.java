package com.chengquan.framework.application;

import android.app.Application;
import android.content.Context;

import com.chengquan.framework.crashhandler.CrashHandler;
import com.chengquan.framework.receiver.ActivityLifeUtil;


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

}
