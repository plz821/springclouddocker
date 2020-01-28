package com.plz821.springclouddocker.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * EurekaServerApplication.java Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020/1/28
 * @time: 16:36
 * @version: v1.0
 * @history: date    author    version    description
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
