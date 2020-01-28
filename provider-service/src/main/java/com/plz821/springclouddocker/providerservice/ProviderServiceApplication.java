package com.plz821.springclouddocker.providerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ProviderServiceApplication.java Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020/1/28
 * @time: 20:41
 * @version: v1.0
 * @history: date    author    version    description
 *
 */
@SpringBootApplication
//@EnableDiscoveryClient  //springboot已自动启用服务注册发现功能，不再需要此注解
public class ProviderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderServiceApplication.class, args);
    }

}
