package com.chengquan.fastrepairapp.activity.market.p;

import com.chengquan.fastrepairapp.bean.market.ProductMarketBean;
import com.chengquan.fastrepairapp.constants.ApiConstants;
import com.chengquan.framework.api.JsonCallback;
import com.chengquan.framework.util.OkGoUtil;

public class ProductMarketPresenter {

    public void getData(JsonCallback<ProductMarketBean> callback){
        OkGoUtil.<ProductMarketBean>get(ApiConstants.API_PRODUCT_MARKET_DATA)
                .execute(callback);
    }
}
