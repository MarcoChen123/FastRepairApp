package com.chengquan.framework.util;

import android.app.Dialog;

import com.chengquan.framework.BuildConfig;
import com.chengquan.framework.receiver.ActivityLifeUtil;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by jo.chen on 2017/9/29.
 */

public class HttpUtil {
    private static HttpUtil mInstance;
    private Dialog mDialog;

    private HttpUtil() {
    }

    public static HttpUtil getInstance() {
        if (mInstance == null) {
            mInstance = new HttpUtil();
        }
        return mInstance;
    }

    private void showDialog() {
        if (mDialog == null) {
            mDialog = DialogUtil.createLoadingDialog(ActivityLifeUtil.getCurrentActivity());
        }
        if (!mDialog.isShowing()) {
            mDialog.show();
        }
    }

    private void dismissDialog() {
        if (mDialog != null && mDialog.isShowing()) {
            mDialog.dismiss();
        }
    }

    public void httpGet(String url) {
        httpGet(url, null, true, null);
    }

    public void httpGet(String url, Map<String, String> map) {
        httpGet(url, map, true, null);
    }

    public void httpGet(String url, Map<String, String> map, final MyStringCallback callback) {
        httpGet(url, map, true, callback);
    }

    public void httpGet(String url, Map<String, String> map, boolean isShowDialog, final MyStringCallback callback) {
        if(!SystemUtil.checkNetwork()){
            return;
        }
        if (isShowDialog) {
            showDialog();
        }
        if (!url.startsWith("http")) {
            url = BuildConfig.apiUrl + url;
        }

        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        Call call = okHttpClient.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if(callback != null) {
                    callback.onError(call, e);
                }
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(callback != null) {
                    callback.onResponse(response.body().string(), response.code());
                }
            }
        });
    }

    public void httpPost(String url) {
        httpPost(url, null, true, null);
    }

    public void httpPost(String url, Map<String, String> map) {
        httpPost(url, map, true, null);
    }

    public void httpPost(String url, Map<String, String> map, final MyStringCallback callback) {
        httpPost(url, map, true, callback);
    }

    public void httpPost(String url, Map<String, String> map, boolean isShowDialog, final MyStringCallback callback) {
        if(!SystemUtil.checkNetwork()){
            return;
        }
        if (isShowDialog) {
            showDialog();
        }
        if (!url.startsWith("http")) {
            url = BuildConfig.apiUrl + url;
        }
        FormBody.Builder requestBody = new FormBody.Builder();
        if (map != null) {
            Set<String> keys = map.keySet();
            for (String key : keys) {
                requestBody.add(key, map.get(key));
            }
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody.build())
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                if(callback != null) {
                    callback.onError(call, e);
                }
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(callback != null) {
                    callback.onResponse(response.body().string(), response.code());
                }
            }
        });
    }

    public Response httpGetSync(String url, Map<String, String> map) throws IOException {
        if (!url.startsWith("http")) {
            url = BuildConfig.apiUrl + url;
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .build();
//        if (map != null) {
//            Set<String> keys = map.keySet();
//            for (String key : keys) {
//                builder.addParams(key, map.get(key));
//            }
//        }
        Call call = okHttpClient.newCall(request);
        return call.execute();
    }

    public Response httpPostSync(String url, Map<String, String> map) throws IOException {
        if (!url.startsWith("http")) {
            url = BuildConfig.apiUrl + url;
        }
        FormBody.Builder requestBody = new FormBody.Builder();
        if (map != null) {
            Set<String> keys = map.keySet();
            for (String key : keys) {
                requestBody.add(key, map.get(key));
            }
        }
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody.build())
                .build();
        Call call = okHttpClient.newCall(request);
        return call.execute();
    }

}
