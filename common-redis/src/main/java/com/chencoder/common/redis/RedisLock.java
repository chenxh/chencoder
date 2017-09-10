package com.chencoder.common.redis;

import org.springframework.util.Assert;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class RedisLock implements Lock{

    private RedisClient client;
    private String key;
    private long defaultTimeout = 10 * 1000;
    private volatile boolean locked = false;

    public RedisLock(RedisClient client, String key){
        this.client = client;
        this.key = key;
    }


    @Override
    public void lock() {
        Assert.notNull(client, "no redis client");
        Assert.hasText(key, "no redis key");
        if (locked) {
            return ;
        }
        while (true) {
            String ok = client.set(key, "locked", "NX", "px", defaultTimeout);
            if ("OK".equals(ok)) {
                locked = false;
                return ;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
        }

    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return false;
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
        if (!locked) {
            throw new UnsupportedOperationException("no lock found");
        }
        locked = false;
        client.del(key);
    }

    @Override
    public Condition newCondition() {
        throw new UnsupportedOperationException();
    }
}
