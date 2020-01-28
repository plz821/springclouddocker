package com.plz821.springclouddocker.providerservice.service;

import com.plz821.springclouddocker.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020-01-28
 * @time: 20:37
 * @version: v1.0
 * @history: date    author    version    description
 */
@Service
public class UserService {
    private static Map<Long, User> users = new HashMap<>();

    static {
        users.put(1L, new User(1L, "xiaxuan", 24));
        users.put(2L, new User(2L, "bingwen", 24));
    }

    public User findUserById(Long id) {
        return users.get(id);
    }
}
