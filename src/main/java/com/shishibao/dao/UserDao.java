package com.shishibao.dao;

import com.shishibao.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public User getUserInfoByUserId(String userId);
}
