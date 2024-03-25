package com.kata.spring.springboot.pp_3_1_springboot.repository;

import com.kata.spring.springboot.pp_3_1_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
