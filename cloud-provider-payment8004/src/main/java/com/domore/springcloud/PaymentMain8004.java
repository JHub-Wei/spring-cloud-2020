package com.domore.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @FileName: PaymentMain8004
 * @Author: zhao
 * @Date: 2020/7/29 20:58
 **/
@SpringBootApplication
// 该注解用于向使用 consul 或者 zookeeper 作为注册中心时注册服务
@EnableDiscoveryClient
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
