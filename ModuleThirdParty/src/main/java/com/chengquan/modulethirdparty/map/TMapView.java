package com.chengquan.modulethirdparty.map;

import android.content.Context;
import android.util.AttributeSet;

import com.tencent.tencentmap.mapsdk.maps.MapView;
import com.tencent.tencentmap.mapsdk.maps.TencentMap;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TMapView extends MapView {
    public TMapView(@NonNull Context context) {
        super(context);
        init();
    }

    public TMapView(@NonNull Context context, TencentMapOptions options) {
        super(context, options);
        init();
    }

    public TMapView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        getMap().getUiSettings().setScaleViewEnabled(false);
    }
}
