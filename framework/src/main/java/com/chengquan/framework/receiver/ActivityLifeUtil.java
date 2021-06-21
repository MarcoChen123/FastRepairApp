package com.chengquan.framework.receiver;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import com.chengquan.framework.util.SystemUtil;


/**
 * Created by jo.chen on 2017/9/29.
 */

public class ActivityLifeUtil implements Application.ActivityLifecycleCallbacks {
    private static Activity mActivity;

    public static Activity getCurrentActivity(){
        return mActivity;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle bundle) {
        SystemUtil.printlnInfo("onActivityCreated------------" + activity.toString());
        mActivity = activity;
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }
}
