package com.chencoder.common.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

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
        return  execute();
    }
    public Object execute(RedisAction action, Object... args) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return action.execute(jedis, args);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (jedis != null) {
                jedis.close();
            }
        }
    }
    public Object executeCmd(Jedis jedis, RedisAction action,  Object... args) throws InvocationTargetException, IllegalAccessException {
        return action.execute(jedis, args);
    }



    static class RedisAction<T> {
        private Method method;
        RedisAction(Method method) {
            this.method = method;
        }
        public T execute(Jedis jedis, Object... args) throws InvocationTargetException, IllegalAccessException {
            if (method == null) {
                throw new RuntimeException("no method found");
            }

            return (T) method.invoke(jedis, args);
        }
    }

}
