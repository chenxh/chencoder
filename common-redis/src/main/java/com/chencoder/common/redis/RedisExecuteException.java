package com.chencoder.common.redis;

public class RedisExecuteException extends RuntimeException{

    public RedisExecuteException() {
        super();
    }

    public RedisExecuteException(String message) {
        super(message);
    }


    public RedisExecuteException(String message, Throwable cause) {
        super(message, cause);
    }
}
