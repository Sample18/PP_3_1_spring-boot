package com.kata.spring.springboot.pp_3_1_springboot.dao;

import com.kata.spring.springboot.pp_3_1_springboot.model.Employe;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeDAOImp implements EmployeDAO {

    private final EntityManager entityManager;

    @Autowired
    public EmployeDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employe> getAllEmploye() {
        return entityManager.createQuery("from Employe", Employe.class).getResultList();
    }

    @Override
    public void remove(int id) {
        Employe employe = entityManager.find(Employe.class, id);
        if (employe != null) {
            entityManager.remove(employe);
        }
    }

    @Override
    public void create(Employe employe) {
        entityManager.persist(employe);
    }

    @Override
    public void update(Employe employe) {
        entityManager.merge(employe);
    }

    @Override
    public Employe findById(int id) {
        return entityManager.find(Employe.class, id);
    }
}
