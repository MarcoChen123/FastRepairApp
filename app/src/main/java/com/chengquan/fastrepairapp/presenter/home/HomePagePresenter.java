package com.chengquan.fastrepairapp.presenter.home;

import com.chengquan.fastrepairapp.bean.home.HomeDataBean;
import com.chengquan.fastrepairapp.constants.ApiConstants;
import com.chengquan.framework.api.JsonCallback;
import com.chengquan.framework.util.OkGoUtil;
import com.lzy.okgo.callback.Callback;

public class HomePagePresenter {


    public void getHomeData(JsonCallback<HomeDataBean> callback){
        OkGoUtil.<HomeDataBean>get(ApiConstants.API_HOME_DATA)
                .execute(callback);
    }
}
