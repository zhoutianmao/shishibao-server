package com.shishibao.service.impl;

import com.shishibao.dao.UserDao;
import com.shishibao.entity.User;
import com.shishibao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public User getUserById(String userId){
        return userDao.getUserInfoByUserId(userId);
    }


}
