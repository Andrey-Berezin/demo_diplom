package com.example.demo_diplom.rest.dao;

import com.example.demo_diplom.rest.entity.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    User getUserById(int id);

    void registerUser(User user);
}
