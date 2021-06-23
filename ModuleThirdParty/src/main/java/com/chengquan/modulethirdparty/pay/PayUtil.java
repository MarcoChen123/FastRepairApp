package com.chengquan.modulethirdparty.pay;

import android.content.Context;
import android.text.TextUtils;

import com.chengquan.framework.BuildConfig;
import com.chengquan.framework.util.ManagerToast;
import com.chengquan.modulethirdparty.pay.bean.WXPayInfo;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

public class PayUtil {

    public static void startWXPay(Context context, WXPayInfo info){
        IWXAPI api = WXAPIFactory.createWXAPI(context, null);
        if(!api.isWXAppInstalled()){
            ManagerToast.showToast("请先安装微信");
            return;
        }
        try {
            String appId = TextUtils.isEmpty(info.appId) ? BuildConfig.wxAppId : info.appId;
            api.registerApp(appId);
            PayReq request = new PayReq();
            request.appId = appId;
            request.partnerId = info.partnerId;
            request.prepayId= info.prepayId;
            request.packageValue = info.packageValue;
            request.nonceStr= info.nonceStr;
            request.timeStamp= info.timeStamp;
            request.sign= info.sign;
            api.sendReq(request);
        } catch (Exception e) {}
    }
}
