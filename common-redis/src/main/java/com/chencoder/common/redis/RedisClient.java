package com.chencoder.common.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisClient {

    private JedisPool jedisPool ;

    private static final JedisPoolConfig DEFAULT_POOL_CONFIG = new JedisPoolConfig();


    public RedisClient(String host, int port) {
        this(DEFAULT_POOL_CONFIG, host, port);
    }

    public RedisClient(JedisPoolConfig poolConfig, String host, int port) {
        jedisPool = new JedisPool(poolConfig, host, port);
    }

    public String set(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.set(key, value);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
        }
}
