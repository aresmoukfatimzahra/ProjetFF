package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.IDao;
import com.example.entity.Livrable;
import com.example.repository.LivrableRepository;

public class LivrableService  implements IDao<Livrable>{
	
	@Autowired
	private LivrableRepository livrablerepo;

	@Override
	public List<Livrable> findAll() {
	
		return livrablerepo.findAll();
	}

	@Override
	public Livrable findById(int id) {
		return livrablerepo.findById(id).get();
	}

	@Override
	public void create(Livrable o) {
		livrablerepo.save(o);
	}

	@Override
	public void update(Livrable o) {
		livrablerepo.save(o);
	}

	@Override
	public void delete(Livrable o) {
		livrablerepo.delete(o);
	}

}
