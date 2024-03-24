package com.kata.spring.springboot.pp_3_1_springboot.service;

import com.kata.spring.springboot.pp_3_1_springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void remove(int id);

    void create(User user);

    void update(User user);
    User findById(int id);
}
