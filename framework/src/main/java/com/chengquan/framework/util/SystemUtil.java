package com.chengquan.framework.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Service;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;

import com.chengquan.framework.BuildConfig;
import com.chengquan.framework.R;
import com.chengquan.framework.application.MainApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jo.chen on 2017/9/29.
 */

public class SystemUtil {
    public static String getProjectVersion() {
        PackageManager manager;
        PackageInfo info;
        manager = MainApplication.getContext().getPackageManager();
        try {
            info = manager.getPackageInfo(MainApplication.getContext().getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
        return info.versionName;
    }

    /**
     * 获取Android系统的api
     *
     * @return
     */
    public static int getAndroidApi() {
        return Build.VERSION.SDK_INT;
    }

    public static int dipTOpx(float dpValue) {
        final float scale = MainApplication.getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static void showInputMethodManagerNow(View v, onInputMethodListener l) {
        showInputMethodManager(v, 0, l);
    }

    // 隐藏软键盘
    public static void hideSoftKeyBoard(Activity activity) {
        if (activity != null && activity.getCurrentFocus() != null) {
            ((InputMethodManager) activity
                    .getSystemService(Context.INPUT_METHOD_SERVICE))
                    .hideSoftInputFromWindow(activity.getCurrentFocus()
                                    .getWindowToken(),
                            InputMethodManager.HIDE_NOT_ALWAYS);
        }

    }


    public static void showInputMethodManager(final View v, long time, final onInputMethodListener l) {
        if (v == null) return;
        v.setFocusable(true);
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        try {
            if (SystemUtil.getAndroidApi() <= 18) {
                getInputMethodManager(v.getContext()).showSoftInput(v, 0);
                if (l != null) l.onInputMethodShow();
            } else {
                Handler handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new InputRunnable(v, l), time);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static InputMethodManager getInputMethodManager(Context context) {
        return (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
    }

    public interface onInputMethodListener {

        void onInputMethodShow();

    }

    private static class InputRunnable implements Runnable {

        private onInputMethodListener l;
        private View v;

        InputRunnable(View v, onInputMethodListener l) {
            this.l = l;
            this.v = v;
        }

        @Override
        public void run() {
            try {
                getInputMethodManager(v.getContext()).showSoftInput(v, 0);
                if (l != null) l.onInputMethodShow();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static void copy(String text) {
        ClipboardManager cmb = (ClipboardManager) MainApplication.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
        cmb.setText(text);
    }

    public static String getTextFromClip() {
        ClipboardManager cmb = (ClipboardManager) MainApplication.getContext().getSystemService(Context.CLIPBOARD_SERVICE);
        if (cmb != null && cmb.getText() != null) {
            return cmb.getText().toString();
        }
        return "";
    }

    public static void printlnInfo(String text) {
        if (!BuildConfig.ENVIRONMENT) {
            Log.i("cwx", text);
        }
    }

    public static boolean isReadContactPermission() {
        // 读取联系人
        Cursor cursor = MainApplication.getContext().getContentResolver().query(ContactsContract.Data.CONTENT_URI, null, null, null, null);
        boolean is = false;
        if (cursor != null && cursor.moveToFirst()) {
            is = true;
            cursor.close();
        }
        return is;
    }


    //短信跳转
    public static void startSms(Context context, String msg, String tel) {
        Uri uri = Uri.parse("smsto:" + tel);
        Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
        intent.putExtra("sms_body", msg);
        context.startActivity(intent);
    }

    //发送 邮件
    public static void startEmail(Context context, String title, String msg, String... toEmails) {
        toEmails = toEmails == null ? new String[0] : toEmails;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822"); // 设置邮件格式
        intent.putExtra(Intent.EXTRA_EMAIL, toEmails);
        intent.putExtra(Intent.EXTRA_SUBJECT, title);
        intent.putExtra(Intent.EXTRA_TEXT, msg);
        context.startActivity(Intent.createChooser(intent, "请选择邮件类型"));
    }

    public static void startVibrator(long time) {
        Vibrator vibrator = (Vibrator) MainApplication.getContext().getSystemService(Service.VIBRATOR_SERVICE);
        vibrator.vibrate(time);
    }

    /**
     * 验证中国大陆手机号： 以1开头的11位的数字
     *
     * @param mobile
     * @return
     */
    private static boolean validateChinaMoblie(String mobile) {
        Pattern pattern = Pattern.compile("1[0-9]{10}");
        Matcher m = pattern.matcher(mobile);
        return m.matches();
    }

    /**
     * 判断网络连接是否存在
     */
    public static boolean hasInternet() {
        if (MainApplication.getContext() == null) {
            return false;
        }
        ConnectivityManager manager = (ConnectivityManager) MainApplication.getContext()

                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if (manager == null) {
            return false;
        }

        NetworkInfo info = manager.getActiveNetworkInfo();

        if (info == null || !info.isConnected()) {
            return false;
        }
        if (info.isRoaming()) {
            return true;
        }
        return true;
    }

    public static boolean checkNetwork(){
        if(hasInternet()){
            return true;
        }else{
            ManagerToast.showToast(R.string.newwork_fail);
            return false;
        }
    }

    /**
     * 获取SDCard的地址
     *
     * @return
     */
    public static String getSDCardPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    public static int getScreenWidth(Context context){
        if(context == null){
            return 0;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = windowManager.getDefaultDisplay();
        if(Build.VERSION.SDK_INT < 13){
            return display.getWidth();
        }
        Point point = new Point();
        display.getSize(point);
        return point.x;
    }

}
