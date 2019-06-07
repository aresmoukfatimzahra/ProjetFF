package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employe;
import com.example.entity.Projet;

public interface ProjetRepository  extends JpaRepository<Projet, Integer>{

}
