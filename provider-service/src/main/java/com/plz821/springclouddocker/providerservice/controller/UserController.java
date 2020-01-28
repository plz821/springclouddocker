package com.plz821.springclouddocker.providerservice.controller;

import com.netflix.discovery.converters.Auto;
import com.plz821.springclouddocker.model.User;
import com.plz821.springclouddocker.providerservice.service.UserService;
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
 * @time: 20:38
 * @version: v1.0
 * @history: date    author    version    description
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = userService.findUserById(id);
        log.info("获取用户id={}的用户，详细信息={}", id, user);
        return user;
    }
}
