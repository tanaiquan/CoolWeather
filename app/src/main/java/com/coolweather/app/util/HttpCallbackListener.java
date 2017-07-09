package com.coolweather.app.util;

/**
 * Created by tanaq on 17-7-9.
 */

public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
