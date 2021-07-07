package com.chengquan.framework.util;

import android.app.Activity;
import android.content.Intent;

import com.lzy.imagepicker.ui.ImageGridActivity;

public class ImagePickerUtil {
    /**
     * 打开系统相机
     * @param activity
     * @param requestCode
     */
    public static void goCamera(Activity activity, int requestCode){
        Intent intent = new Intent(activity, ImageGridActivity.class);
        intent.putExtra(ImageGridActivity.EXTRAS_TAKE_PICKERS,true); // 是否是直接打开相机
        activity.startActivityForResult(intent, requestCode);
    }

    /**
     * 相册选择
     * @param activity
     * @param requestCode
     */
    public static void goAlbum(Activity activity, int requestCode){
        Intent intent = new Intent(activity, ImageGridActivity.class);
        activity.startActivityForResult(intent, requestCode);
    }
}
