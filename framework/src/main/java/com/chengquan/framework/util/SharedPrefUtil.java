package com.chengquan.framework.util;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class SharedPrefUtil {
	private static String NAME = "SHGY";

	public static void putString(Context context, String key, String value) {
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		Editor editor = mySharedPreferences.edit();
		editor.putString(key, value);
		editor.commit();
	}
	
	public static void putLong(Context context, String key, long value) {
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		Editor editor = mySharedPreferences.edit();
		editor.putLong(key, value);
		editor.commit();
	}
	
	public static void putBoolean(Context context, String key, boolean value) {
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		Editor editor = mySharedPreferences.edit();
		editor.putBoolean(key, value);
		editor.commit();
	}
	
	public static void putInt(Context context, String key, int value) {
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		Editor editor = mySharedPreferences.edit();
		editor.putInt(key, value);
		editor.commit();
	}
	
	public static String getString(Context context, String key, String defaultValue){
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		return mySharedPreferences.getString(key, defaultValue);
	}
	
	public static long getLong(Context context, String key, long defaultValue){
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		return mySharedPreferences.getLong(key, defaultValue);
	}
	
	public static boolean getBoolean(Context context, String key, boolean defaultValue){
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		return mySharedPreferences.getBoolean(key, defaultValue);
	}
	
	public static int getInt(Context context, String key, int defaultValue){
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		return mySharedPreferences.getInt(key, defaultValue);
	}
	
	public static void remove(Context context, String key){
		SharedPreferences mySharedPreferences = context.getSharedPreferences(
				NAME, Activity.MODE_PRIVATE);
		Editor editor = mySharedPreferences.edit();
		editor.remove(key);
		editor.commit();
	}

}
