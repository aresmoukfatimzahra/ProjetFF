package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.IDao;
import com.example.entity.Projet;
import com.example.repository.ProjetRepository;

public class ProjetService implements IDao<Projet>{
	
	@Autowired
	private ProjetRepository projetRepo;

	@Override
	public List<Projet> findAll() {
	
		return projetRepo.findAll();
	}

	@Override
	public Projet findById(int id) {
		return projetRepo.findById(id).get();
	}

	@Override
	public void create(Projet o) {
		projetRepo.save(o);
	}

	@Override
	public void update(Projet o) {
		projetRepo.save(o);
	}

	@Override
	public void delete(Projet o) {
		projetRepo.delete(o);
	}

}
