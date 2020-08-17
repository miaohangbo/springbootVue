package com.qf.controller;

import com.qf.pojo.User;
import com.qf.pojo.req.UserReq;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 54110 on 2020/8/17.
 */
@RestController  //@Controller @ResponseBody

public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findById/{id}")
    public User findById(@PathVariable("id")Integer id){
        return userService.findById(id);
    }

    @RequestMapping("/update")
    public Integer updateAndSave(@RequestBody User user){
        return userService.updateAndSave(user);
    }

    @RequestMapping(value = "/registry",method = RequestMethod.POST)
    public Integer registry(@RequestBody UserReq userReq){

        String email = userReq.getEmail();

        String o =(String)redisTemplate.opsForValue().get(email);
        if (o==null||!o.equals(userReq.getCode())){
            return 2;
        }
        //将数据添加到数据库

        return 1;
    }
}
