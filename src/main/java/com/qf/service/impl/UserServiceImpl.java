package com.qf.service.impl;

import com.qf.dao.UserResponsitory;
import com.qf.pojo.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by 54110 on 2020/8/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserResponsitory userResponsitory;

    @Override
    public List<User> findAll() {

        return   userResponsitory.findAll();
    }

    @Override
    public User findById(Integer id) {

            Optional<User> byId = userResponsitory.findById(id);
            if (byId.isPresent()){
                return byId.get();
            }
            return null;
    }

    @Override
    public Integer updateAndSave(User user) {

        User user1 = userResponsitory.saveAndFlush(user);
        if (user1!=null){
            return 1;
        }
        return 0;
    }
}
