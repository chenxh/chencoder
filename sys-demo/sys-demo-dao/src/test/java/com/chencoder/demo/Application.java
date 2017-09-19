package com.chencoder.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.chencoder.demo.dao.mapper")
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
	}
}
