package com.alan.springbootlei.service.impl;

import com.alan.springbootlei.dao.UserDao;
import com.alan.springbootlei.dto.UserRegisterRequest;
import com.alan.springbootlei.model.User;
import com.alan.springbootlei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.register(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
