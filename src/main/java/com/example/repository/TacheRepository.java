package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employe;
import com.example.entity.Tache;

public interface TacheRepository  extends JpaRepository<Tache, Integer>{

}
