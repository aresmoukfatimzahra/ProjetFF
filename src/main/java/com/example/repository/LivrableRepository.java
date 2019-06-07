package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.entity.Livrable;

public interface LivrableRepository  extends JpaRepository<Livrable, Integer>{

}
