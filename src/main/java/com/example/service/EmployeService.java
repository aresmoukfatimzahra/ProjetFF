package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;

import com.example.dao.IDao;
import com.example.entity.Employe;
import com.example.repository.EmployeRepository;



@Primary
public class EmployeService implements IDao<Employe>{
	
	@Autowired
	private EmployeRepository employeRepo;

	@Override
	public List<Employe> findAll() {
	
		return employeRepo.findAll();
	}

	@Override
	public Employe findById(int id) {
		return employeRepo.findById(id).get();
	}

	@Override
	public void create(Employe o) {
		employeRepo.save(o);
	}

	@Override
	public void update(Employe o) {
		employeRepo.save(o);
	}

	@Override
	public void delete(Employe o) {
		employeRepo.delete(o);
	}
}
