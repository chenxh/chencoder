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
        return execute((jedis, args) -> jedis.set((String)args[0], (String)args[1]), new Object[]{key, value});
    }

    public String set(String key, String value, String nxxx, String  expx,long timeout) {
        return execute((jedis, args) ->
                jedis.set((String) args[0], (String) args[1], (String) args[2], (String) args[3], (long) timeout),
                new Object[]{key, value, nxxx, expx, timeout});
    }

    public String get(String key) {
        return execute((jedis, args) -> jedis.get((String)args[0] ), new Object[]{key});
    }

    public Long setnx(String key, String value) {
        return execute((jedis, args) -> {
            return jedis.setnx((String) args[0], (String) args[1]);}, new Object[]{key, value});
    }

    public Long del(String key) {
        return execute((jedis, args) -> jedis.del(key), new Object[]{key});
    }


    public <T> T execute(RedisAction<T> action, Object... args) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return action.execute(jedis, args);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (jedis != null) {
                jedisPool.returnResourceObject(jedis);
            }
        }
    }
}
