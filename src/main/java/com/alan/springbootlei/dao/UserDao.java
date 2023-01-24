package com.alan.springbootlei.dao;

import com.alan.springbootlei.dto.UserRegisterRequest;
import com.alan.springbootlei.model.User;

public interface UserDao {
    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}
