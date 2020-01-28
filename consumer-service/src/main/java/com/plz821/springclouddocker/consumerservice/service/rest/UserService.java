package com.plz821.springclouddocker.consumerservice.service.rest;

import com.netflix.discovery.converters.Auto;
import com.plz821.springclouddocker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020-01-28
 * @time: 20:48
 * @version: v1.0
 * @history: date    author    version    description
 */
@Service
public class UserService {
    private RestTemplate restTemplate;

    @Autowired
    public UserService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public User findById(Long id) {
        return restTemplate.getForObject("http://PROVIDER-SERVICE/user/" + id, User.class);
    }
}
