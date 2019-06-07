package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.IDao;
import com.example.entity.Organisme;
import com.example.repository.OrganismeRepository;

public class OrganismeService implements IDao<Organisme>{
	
	@Autowired
	private OrganismeRepository organismerepo;

	@Override
	public List<Organisme> findAll() {
	
		return organismerepo.findAll();
	}

	@Override
	public Organisme findById(int id) {
		return organismerepo.findById(id).get();
	}

	@Override
	public void create(Organisme o) {
		organismerepo.save(o);
	}

	@Override
	public void update(Organisme o) {
		organismerepo.save(o);
	}

	@Override
	public void delete(Organisme o) {
		organismerepo.delete(o);
	}

}
