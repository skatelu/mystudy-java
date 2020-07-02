package com.example.changedata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.changedata.dao")
public class ChangedataApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChangedataApplication.class, args);
    }

}
