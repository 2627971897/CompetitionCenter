package com.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.edu.mapper")
public class CompetitioncenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompetitioncenterApplication.class, args);
    }

}
