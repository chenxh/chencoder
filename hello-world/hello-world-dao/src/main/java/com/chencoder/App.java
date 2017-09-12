package com.chencoder;

import com.chencoder.common.base.mybatis.MybatisGeneratorUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App{


    private static String MODULE = "hello-world";
    private static String DATABASE = "test";
    private static String TABLE_PREFIX = "";
    private static String PACKAGE_NAME = "com.chencoder.hello.world";
//    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String JDBC_URL = "jdbc:MySql://localhost:3306/test?characterEncoding=UTF-8";
    private static String JDBC_USERNAME = "root";
    private static String JDBC_PASSWORD = "";

    private static Map<String, String> LAST_INSERT_ID_TABLES = new HashMap<>();
    static{
        LAST_INSERT_ID_TABLES.put("blog", "id");
    }

    public static void main(String[] args) throws Exception {
        MybatisGeneratorUtil.generator(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, MODULE, DATABASE, TABLE_PREFIX, PACKAGE_NAME, LAST_INSERT_ID_TABLES);
    }
}
