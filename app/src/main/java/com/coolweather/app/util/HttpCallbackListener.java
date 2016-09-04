package com.coolweather.app.util;

/**
 * Created by zx on 2016/8/7.
 */
public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
