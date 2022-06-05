package com.example.demo_diplom.rest.service_impl;

import com.example.demo_diplom.rest.dao.UserDAO;
import com.example.demo_diplom.rest.entity.User;
import com.example.demo_diplom.rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public User getUserById(final int id) {
        return userDAO.getUserById(id);
    }

    @Override
    @Transactional
    public void registerUser(final User user) {
        userDAO.registerUser(user);
    }
}
