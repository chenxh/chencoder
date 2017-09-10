package com.chencoder.common.redis;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RedisClientTest {

    private RedisClient redisClient;

    @BeforeClass
    public void setUp() {
        redisClient = new RedisClient("127.0.0.1", 1121);
    }

    @Test
    public void testSetValue() {


    }

}