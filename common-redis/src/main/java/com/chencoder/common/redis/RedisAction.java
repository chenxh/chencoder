package com.chencoder.common.redis;

import redis.clients.jedis.Jedis;

public interface RedisAction<T> {

    T execute(Jedis jedis, Object... args);

}
