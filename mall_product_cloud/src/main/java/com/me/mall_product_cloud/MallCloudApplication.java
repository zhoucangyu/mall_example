package com.me.mall_product_cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 使用eureka注册微服务
 * 这样其他服务可以通过eureka注册中心调用本微服务
 */
// 开启注册
@EnableEurekaClient
@SpringBootApplication
public class MallCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCloudApplication.class, args);
    }

}
