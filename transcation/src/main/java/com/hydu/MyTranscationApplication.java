package com.hydu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



/**
 * Created on 2020/6/1 @author heyong
 */

@SpringBootApplication
@MapperScan(value = "com.hydu.mapper")


public class MyTranscationApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyTranscationApplication.class);
    }
}