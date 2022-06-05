package com.example.demo_diplom.rest.controller;

import com.example.demo_diplom.rest.entity.User;
import com.example.demo_diplom.rest.exception_handling.NoSuchUserException;
import com.example.demo_diplom.rest.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")//контроллер, управлеющий рест запросами и ответами
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        if (user == null) {
            throw new NoSuchUserException("There is no user with ID = " + id + " in DataBase");
        }
        return user;
    }

    @PostMapping("/users")
    public User registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return user;
    }


    /**
     * Добавить метод для участия в проекте
     */
}
