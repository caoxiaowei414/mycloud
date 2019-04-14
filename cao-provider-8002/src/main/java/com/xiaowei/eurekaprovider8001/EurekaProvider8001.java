package com.xiaowei.eurekaprovider8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.xiaowei.eurekaprovider8001.dao.mapper")
public class EurekaProvider8001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider8001.class, args);
    }

}
