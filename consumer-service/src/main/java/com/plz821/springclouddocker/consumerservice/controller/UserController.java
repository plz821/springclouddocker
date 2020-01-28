package com.plz821.springclouddocker.consumerservice.controller;

import com.plz821.springclouddocker.consumerservice.service.feign.UserServiceClient;
import com.plz821.springclouddocker.consumerservice.service.rest.UserService;
import com.plz821.springclouddocker.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020-01-28
 * @time: 20:50
 * @version: v1.0
 * @history: date    author    version    description
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    private UserServiceClient userServiceClient;

    @Autowired
    public UserController(UserService userService, UserServiceClient userServiceClient) {
        this.userService = userService;
        this.userServiceClient = userServiceClient;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = userService.findById(id);
        log.info("获取到的用户id={}, User={}", id, user);
        return user;
    }

    @GetMapping("/feign/{id}")
    public User findByIdWithFeign(@PathVariable Long id) {
        User user = userServiceClient.findById(id);
        log.info("获取到的用户id={}, User={}", id, user);
        return user;
    }
}
