package com.plz821.springclouddocker.consumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumerServiceApplication.java Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020/1/28
 * @time: 20:44
 * @version: v1.0
 * @history: date    author    version    description
 *
 */
@SpringBootApplication
//@EnableDiscoveryClient  //springboot已自动启用服务注册发现功能，不再需要此注解
@EnableFeignClients
public class ConsumerServiceApplication {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServiceApplication.class, args);
    }

}
