package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Integer>{

}
