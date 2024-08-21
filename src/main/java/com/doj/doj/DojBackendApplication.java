package com.doj.doj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@MapperScan("com.doj.doj.mapper")
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
public class DojBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(DojBackendApplication.class, args);
    }

}
