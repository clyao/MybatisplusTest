package com.clyao.mybatisplustest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.clyao.mybatisplustest.mapper")
public class MybatisplusTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusTestApplication.class, args);
    }

}
