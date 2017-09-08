package com.chencoder.common.base.mybatis;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MybatisGeneratorUtilTest {

    private static String MODULE = "sys-demo";
    private static String DATABASE = "test";
    private static String TABLE_PREFIX = "";
    private static String PACKAGE_NAME = "com.chencoder.test";
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String JDBC_URL = "jdbc:MySql://localhost:3306/erp?characterEncoding=UTF-8";
    private static String JDBC_USERNAME = "root";
    private static String JDBC_PASSWORD = "";

    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();

    @Test
    public void generator() throws Exception {

        MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);

    }

}