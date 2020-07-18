package com.peng.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author peng
 * @Date 2020/7/18 19:22
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
@EnableFeignClients
public class BackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class,args);
    }
}
