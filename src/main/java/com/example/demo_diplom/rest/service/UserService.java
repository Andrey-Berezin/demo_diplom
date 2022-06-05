package com.example.demo_diplom.rest.service;


import com.example.demo_diplom.rest.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(int id);

    void registerUser(User user);
}
