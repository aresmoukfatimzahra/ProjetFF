package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employe;
import com.example.entity.Phase;

public interface PhaseRepository  extends JpaRepository<Phase, Integer>{

}
