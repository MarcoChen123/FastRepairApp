package com.chengquan.framework.util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

public class JsonUtil {
    private static Gson gson;

    static {
        gson = gson == null ? new Gson() : gson;
    }

    public static <T> T json2Object(String text, Class<T> cls){
        T t = null;
        if(gson != null){
            t = gson.fromJson(text,cls);
        }
        return t;
    }

    public static String obj2Json(Object object){
        String gsonString = null;
        if(gson != null){
            gsonString = gson.toJson(object);
        }
        return gsonString;
    }

    public static <T> List<T> json2List(String gsonString, Class<T> cls){
        List<T> list = new ArrayList<>();
        if(gson != null) {
            JsonArray array = new JsonParser().parse(gsonString).getAsJsonArray();
            for (JsonElement element : array) {
                list.add(gson.fromJson(element, cls));
            }
        }
        return list;
    }
}
