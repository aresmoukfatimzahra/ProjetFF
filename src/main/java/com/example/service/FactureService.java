package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.IDao;
import com.example.entity.Document;
import com.example.entity.Facture;
import com.example.repository.DocumentRepository;
import com.example.repository.FactureRepository;

public class FactureService implements IDao<Facture>{
	
	@Autowired
	private FactureRepository facturerepo;

	@Override
	public List<Facture> findAll() {
	
		return facturerepo.findAll();
	}

	@Override
	public Facture findById(int id) {
		return facturerepo.findById(id).get();
	}

	@Override
	public void create(Facture o) {
		facturerepo.save(o);
	}

	@Override
	public void update(Facture o) {
		facturerepo.save(o);
	}

	@Override
	public void delete(Facture o) {
		facturerepo.delete(o);
	}

}
