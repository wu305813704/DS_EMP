package com.sunyard.emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.sunyard.emp.mapper")
public class EmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpApplication.class, args);
    }

}
