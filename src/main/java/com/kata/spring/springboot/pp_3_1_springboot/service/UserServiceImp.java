package com.kata.spring.springboot.pp_3_1_springboot.service;

import com.kata.spring.springboot.pp_3_1_springboot.model.User;
import com.kata.spring.springboot.pp_3_1_springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    @Override
    public void remove(int id) {
        userRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public User findById(int id) {
        return userRepository.findById(id).get();
    }
}
