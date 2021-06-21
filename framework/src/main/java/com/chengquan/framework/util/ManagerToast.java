package com.chengquan.framework.util;




import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

import com.chengquan.framework.application.MainApplication;


/**
 * ManagerToast类是用来管理Toast的类,主要是控制Toast显示时间以及重复显示问题
 * 
 * @author NapoleonBai
 *
 */
public class ManagerToast {
	public static Toast mToast = null;
	private static Context mContext = MainApplication.getContext();

	private static Handler mhandler = new Handler();
	// 设置一个定时器
	private static Runnable r = new Runnable() {
		public void run() {
			mToast.cancel();
		};
	};

	/**
	 * 设置显示的Toast
	 * 
	 * @param text
	 *            Toast显示的文本
	 */
	public static void showToast(String text) {
		try {
			// 关闭定时器
			if (mContext == null) {
				return;
			}
			mhandler.removeCallbacks(r);
			if (null != mToast) {
				mToast.setText(text);
			} else {
				mToast = Toast.makeText(mContext, text, Toast.LENGTH_SHORT);
			}
			// 1000毫秒之后再次调用定时器
			mhandler.postDelayed(r, 1000);
			mToast.show();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return;
		}	
	}

	/**
	 * 如果传入的是ID,那么就使用这个方法
	 * 
	 * @param strId
	 *            资源ID
	 */
	public static void showToast(int strId) {
		showToast(mContext.getString(strId));
	}
}
