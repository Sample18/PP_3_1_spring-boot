package com.kata.spring.springboot.pp_3_1_springboot.service;

import com.kata.spring.springboot.pp_3_1_springboot.dao.EmployeDAO;
import com.kata.spring.springboot.pp_3_1_springboot.model.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeServiceImp implements EmployeService {

    @Autowired
    private EmployeDAO employeDAO;

    @Transactional(readOnly = true)
    @Override
    public List<Employe> getAllEmploye() {
        return employeDAO.getAllEmploye();
    }

    @Transactional
    @Override
    public void remove(int id) {
        employeDAO.remove(id);
    }

    @Transactional
    @Override
    public void create(Employe employe) {
        employeDAO.create(employe);
    }

    @Transactional
    @Override
    public void update(Employe employe) {
        employeDAO.update(employe);
    }

    @Transactional(readOnly = true)
    @Override
    public Employe findById(int id) {
        System.out.println(1);
        return employeDAO.findById(id);
    }
}
