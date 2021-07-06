package com.chengquan.framework.api;

import java.io.Serializable;

public class BaseApiResponse<T> implements Serializable {
    public int code;
    public String msg;
    public T data;
}
