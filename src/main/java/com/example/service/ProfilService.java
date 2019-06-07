package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.IDao;
import com.example.entity.Profil;
import com.example.repository.ProfilRepository;

public class ProfilService implements IDao<Profil>{
	
	@Autowired
	private ProfilRepository profilrepo;

	@Override
	public List<Profil> findAll() {
	
		return profilrepo.findAll();
	}

	@Override
	public Profil findById(int id) {
		return profilrepo.findById(id).get();
	}

	@Override
	public void create(Profil o) {
		profilrepo.save(o);
	}

	@Override
	public void update(Profil o) {
		profilrepo.save(o);
	}

	@Override
	public void delete(Profil o) {
		profilrepo.delete(o);
	}

}
