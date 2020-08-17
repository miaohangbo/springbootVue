package com.qf.controller;

import com.qf.utils.QiniuUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by 54110 on 2020/8/17.
 */
@RestController
public class UploadController {

    @Autowired
    QiniuUtils qiniuUtils;


    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String upload(@RequestParam("file")MultipartFile multipartFile){

        String originalFilename = multipartFile.getOriginalFilename();
        System.out.println(originalFilename);
        return    qiniuUtils.upload(multipartFile);
    }
}
