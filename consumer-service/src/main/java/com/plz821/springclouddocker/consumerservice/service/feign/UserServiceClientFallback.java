package com.plz821.springclouddocker.consumerservice.service.feign;

import com.plz821.springclouddocker.model.User;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020-01-28
 * @time: 22:28
 * @version: v1.0
 * @history: date    author    version    description
 */
@Slf4j
@Component
public class UserServiceClientFallback implements UserServiceClient {

    @Override
    public User findById(Long id) {
        log.error("[x]服务降级：调用PROVIDER-SERVICE的/user/{id}失败。");
        return null;
    }
}
