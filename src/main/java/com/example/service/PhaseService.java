package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.IDao;
import com.example.entity.Phase;
import com.example.repository.PhaseRepository;

public class PhaseService implements IDao<Phase>{
	
	@Autowired
	private PhaseRepository phaserepo;

	@Override
	public List<Phase> findAll() {
	
		return phaserepo.findAll();
	}

	@Override
	public Phase findById(int id) {
		return phaserepo.findById(id).get();
	}

	@Override
	public void create(Phase o) {
		phaserepo.save(o);
	}

	@Override
	public void update(Phase o) {
		phaserepo.save(o);
	}

	@Override
	public void delete(Phase o) {
		phaserepo.delete(o);
	}

}
