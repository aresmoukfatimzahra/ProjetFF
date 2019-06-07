package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employe;
import com.example.entity.Organisme;

public interface OrganismeRepository  extends JpaRepository<Organisme, Integer>{

}
