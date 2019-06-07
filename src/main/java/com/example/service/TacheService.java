package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.IDao;
import com.example.entity.Tache;
import com.example.repository.ProjetRepository;
import com.example.repository.TacheRepository;

public class TacheService implements IDao<Tache>{
	
	@Autowired
	private TacheRepository tacherepo;

	@Override
	public List<Tache> findAll() {
	
		return tacherepo.findAll();
	}

	@Override
	public Tache findById(int id) {
		return tacherepo.findById(id).get();
	}

	@Override
	public void create(Tache o) {
		tacherepo.save(o);
	}

	@Override
	public void update(Tache o) {
		tacherepo.save(o);
	}

	@Override
	public void delete(Tache o) {
		tacherepo.delete(o);
	}


}
