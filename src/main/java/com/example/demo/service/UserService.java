package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    boolean insertUser(User user);

    User queryUserByName(String username);

    User queryUser(User user);
}
