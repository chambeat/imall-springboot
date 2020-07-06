package com.chm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chm.mapper")
public class ImallApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImallApplication.class, args);
    }

}
