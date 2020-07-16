package com.dida.grainmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.dida.grainmall.user.mapper")
public class GrainmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrainmallUserApplication.class, args);
    }

}
