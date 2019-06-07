package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.IDao;
import com.example.entity.Document;
import com.example.repository.DocumentRepository;

public class DocumentService implements IDao<Document>{
	
	@Autowired
	private DocumentRepository documentrepo;

	@Override
	public List<Document> findAll() {
	
		return documentrepo.findAll();
	}

	@Override
	public Document findById(int id) {
		return documentrepo.findById(id).get();
	}

	@Override
	public void create(Document o) {
		documentrepo.save(o);
	}

	@Override
	public void update(Document o) {
		documentrepo.save(o);
	}

	@Override
	public void delete(Document o) {
		documentrepo.delete(o);
	}

}
