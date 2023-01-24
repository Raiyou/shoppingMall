package com.alan.springbootlei.service;

import com.alan.springbootlei.dto.UserLoginRequest;
import com.alan.springbootlei.dto.UserRegisterRequest;
import com.alan.springbootlei.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
