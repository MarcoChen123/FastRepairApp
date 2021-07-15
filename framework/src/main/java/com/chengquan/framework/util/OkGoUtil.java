package com.chengquan.framework.util;

import android.text.TextUtils;

import com.chengquan.framework.BuildConfig;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.request.GetRequest;
import com.lzy.okgo.request.PostRequest;

public class OkGoUtil {

    public static <T>GetRequest<T> get(String url) {
        if(!TextUtils.isEmpty(url) && !url.startsWith("http")){
            url = BuildConfig.apiUrl + url;
        }
        return OkGo.<T>get(url);
    }

    public static <T> PostRequest<T> post(String url) {
        if(!TextUtils.isEmpty(url) && !url.startsWith("http")){
            url = BuildConfig.apiUrl + url;
        }
        return OkGo.<T>post(url);
    }
}
