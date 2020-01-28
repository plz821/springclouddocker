package com.plz821.springclouddocker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: Alex
 * @date: 2020-01-28
 * @time: 20:27
 * @version: v1.0
 * @history: date    author    version    description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Long id;

    private String username;

    private Integer age;
}
