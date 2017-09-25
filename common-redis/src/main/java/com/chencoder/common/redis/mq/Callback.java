package com.chencoder.common.redis.mq;

public interface Callback {
    public void onMessage(String message);
}