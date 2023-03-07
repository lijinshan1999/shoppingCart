package com.example.demo.dao;

import com.example.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    int insertUser(User user);

    User queryUserByName(String username);

    User queryUser(User user);
}
