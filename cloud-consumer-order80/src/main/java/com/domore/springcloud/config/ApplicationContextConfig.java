package com.domore.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @FileName: ApplicationContextConfig
 * @Author: zhao
 * @Date: 2020/7/22 21:26
 **/
@Configuration
public class ApplicationContextConfig {
    @Bean
    // 使用 @LoadBalanced 赋予 RestTemplate 负载均衡能力
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
