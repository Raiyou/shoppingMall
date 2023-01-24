package com.alan.springbootlei.service;

import com.alan.springbootlei.dto.UserRegisterRequest;
import com.alan.springbootlei.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
