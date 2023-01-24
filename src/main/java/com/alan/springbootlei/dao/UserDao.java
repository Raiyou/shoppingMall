package com.alan.springbootlei.dao;

import com.alan.springbootlei.dto.UserRegisterRequest;
import com.alan.springbootlei.model.User;

public interface UserDao {

    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
