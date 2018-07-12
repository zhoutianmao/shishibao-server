package com.shishibao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

@MapperScan("com.shishibao.dao")
public class Application {
        public static void main(String[] args) {
            SpringApplication.run(com.shishibao.Application.class, args);
        }
}
