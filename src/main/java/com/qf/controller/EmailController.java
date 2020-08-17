package com.qf.controller;

import com.qf.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 54110 on 2020/8/17.
 */
@RestController
public class EmailController {


    @Autowired
    EmailService emailService;


    @RequestMapping("/sendMail")
    public Integer sendMail(@RequestParam("mail")String mail){
        return emailService.sendMail(mail);
    }
}
