package com.hydu.controller;

import com.hydu.annotation.MyTranscation;
import com.hydu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on 2020/6/2 @author heyong
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/insert")
    @MyTranscation

    public String insert (String userName){
        return userService.insert(userName)>0?"success":"fail";
    }

}