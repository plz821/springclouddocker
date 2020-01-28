package com.plz821.springclouddocker.consumerservice.service.feign;

import com.plz821.springclouddocker.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020-01-28
 * @time: 22:04
 * @version: v1.0
 * @history: date    author    version    description
 */
@FeignClient(name = "PROVIDER-SERVICE", fallback = UserServiceClientFallback.class)
public interface UserServiceClient {

    /**
     * fetch user by id
     * @param id: user id
     * @return user
     */
    @GetMapping("/user/{id}")
    User findById(@PathVariable(value = "id") Long id);
}
