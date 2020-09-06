package com.me.mall_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka服务注册中心
 */
// 开启eureka服务端
@EnableEurekaServer
@SpringBootApplication
public class MallEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallEurekaServerApplication.class, args);
    }

}
