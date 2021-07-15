package com.chengquan.framework.api;

import com.chengquan.framework.BuildConfig;
import com.chengquan.framework.util.MD5Util;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.request.base.Request;

import org.json.JSONArray;
import org.json.JSONObject;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Set;

import okhttp3.Response;

public abstract class JsonCallback<T> extends AbsCallback<T> {

    private Type type;
    private Class<T> clazz;

    public JsonCallback() {
    }

    public JsonCallback(Type type) {
        this.type = type;
    }

    public JsonCallback(Class<T> clazz) {
        this.clazz = clazz;
    }

    @Override
    public void onStart(Request<T, ? extends Request> request) {
        super.onStart(request);
        // 主要用于在所有请求之前添加公共的请求头或请求参数
        // 例如登录授权的 token
        // 使用的设备信息
        // 可以随意添加,也可以什么都不传
        // 还可以在这里对所有的参数进行加密，均在这里实现
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/M/d HH:mm:ss");
        request.params("timestamp", sdf.format(System.currentTimeMillis()));

        try {
            JSONObject object = new JSONObject();
            Set<String> set = request.getParams().urlParamsMap.keySet();
            for (String key : set) {
                object.put(key, request.getParams().urlParamsMap.get(key));
            }
            object.put("appSecret", BuildConfig.appSecret);
            String sign = MD5Util.MD5(object.toString());
            request.params("sign", sign );
        } catch (Exception e) {

        }


    }

    /**
     * 该方法是子线程处理，不能做ui相关的工作
     * 主要作用是解析网络返回的 response 对象,生产onSuccess回调中需要的数据对象
     * 这里的解析工作不同的业务逻辑基本都不一样,所以需要自己实现,以下给出的时模板代码,实际使用根据需要修改
     */
    @Override
    public T convertResponse(Response response) throws Throwable {

        if (type == null) {
            if (clazz == null) {
                Type genType = getClass().getGenericSuperclass();
                type = ((ParameterizedType) genType).getActualTypeArguments()[0];
            } else {
                JsonConvert<T> convert = new JsonConvert<>(clazz);
                return convert.convertResponse(response);
            }
        }
        String result = response.body().string();
        JSONObject jsonObject = new JSONObject(result);
        boolean success = jsonObject.getBoolean("success");
        String msg = jsonObject.getString("msg");
        int code = jsonObject.getInt("code");
        String data = jsonObject.getString("data");
        if(code != 0){
            throw new IllegalArgumentException(msg);
        }

        if (type != String.class && type != JSONObject.class && type != JSONArray.class) {
            return new Gson().fromJson(data, type);
        }
        JsonConvert<T> convert = new JsonConvert<>(type);
        return convert.convertResponse(response);
    }
}
