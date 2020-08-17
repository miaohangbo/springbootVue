package com.qf.service;

import com.qf.pojo.User;

import java.util.List;

/**
 * Created by 54110 on 2020/8/17.
 */
public interface UserService {


    List<User> findAll();

    User findById(Integer id);

    Integer updateAndSave(User user);
}
