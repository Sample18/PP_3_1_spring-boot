package com.kata.spring.springboot.pp_3_1_springboot.dao;


import com.kata.spring.springboot.pp_3_1_springboot.model.Employe;

import java.util.List;

public interface EmployeDAO {
    List<Employe> getAllEmploye();
    void remove(int id);

    void create(Employe employe);

    void update(Employe employe);

    Employe findById(int id);

}
