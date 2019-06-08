package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Document;
import com.example.entity.Facture;
import com.example.service.FactureService;
@RestController
@RequestMapping("/api/facture")
@CrossOrigin
public class FactureController {
	@Autowired
	private FactureService factureService;
	
	@GetMapping
	public List<Facture> getFactures(){
		return factureService.findAll();
	}
	
	@PostMapping 
	public void addEmploye(@RequestBody Facture facture) {
		factureService.create(facture);
	}
	
	@PutMapping
	public void updateEmploye(@RequestBody Facture document) {
		factureService.update(document);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmploye(@PathVariable int id) {
		Facture doc =factureService.findById(id);
		factureService.delete(doc);
	}
}
