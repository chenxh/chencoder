package com.chencoder.common.base.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class AESUtilTest {
    @Test
    public void AESEncode() throws Exception {
        String[] keys = {
                "", "123456"
        };
        System.out.println("key | AESEncode | AESDecode");
        for (String key : keys) {
            System.out.print(key + " | ");
            String encryptString = AESUtil.encode(key);
            System.out.print(encryptString + " | ");
            String decryptString = AESUtil.decode(encryptString);
            System.out.println(decryptString);
            assertEquals(key, decryptString);
        }
    }

}