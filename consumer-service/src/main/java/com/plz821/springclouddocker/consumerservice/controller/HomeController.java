package com.plz821.springclouddocker.consumerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.serviceregistry.EurekaRegistration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020-01-28
 * @time: 21:36
 * @version: v1.0
 * @history: date    author    version    description
 */
@RestController
@RequestMapping("/")
public class HomeController {

    private EurekaRegistration registration;

    @Value("${spring.profiles.active}")
    private String activeProfile;

    @Autowired
    public HomeController(@Qualifier("eurekaRegistration") EurekaRegistration registration) {
        this.registration = registration;
    }

    @GetMapping
    public String index() {
        return registration.getServiceId() + " (" + registration.getHost() + ":" + registration.getPort() + ") " +
                "=> Active Profile: " + activeProfile;
    }
}
