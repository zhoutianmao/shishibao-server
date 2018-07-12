package com.shishibao.controller;

import com.shishibao.entity.User;
import com.shishibao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/test")
    public User test(){
        return userService.getUserById("123");
    }
}
