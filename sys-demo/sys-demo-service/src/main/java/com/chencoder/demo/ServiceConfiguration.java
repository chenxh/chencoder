package com.chencoder.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = "com.chencoder.demo.dao.mapper")
public class ServiceConfiguration {
}