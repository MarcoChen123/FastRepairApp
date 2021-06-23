package com.chengquan.modulethirdparty.map;

import android.content.Context;
import android.location.LocationManager;
import android.os.Looper;

import com.tencent.map.geolocation.TencentLocation;
import com.tencent.map.geolocation.TencentLocationListener;
import com.tencent.map.geolocation.TencentLocationManager;

public class LocationUtil {

    public void locate(Context context){
        TencentLocationManager manager = TencentLocationManager.getInstance(context);
        manager.requestSingleFreshLocation(null, locationListener, Looper.getMainLooper());
    }

    private TencentLocationListener locationListener = new TencentLocationListener() {
        @Override
        public void onLocationChanged(TencentLocation tencentLocation, int i, String s) {

        }

        @Override
        public void onStatusUpdate(String s, int i, String s1) {

        }
    };
}
