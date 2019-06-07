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
import com.example.entity.Employe;
import com.example.service.DocumentService;


@RestController
@RequestMapping("/api/document")
@CrossOrigin
public class DocumentController {
	
		@Autowired
		private DocumentService documentService;
		
		@GetMapping
		public List<Document> getDocuments(){
			return documentService.findAll();
		}
		
		@PostMapping 
		public void addEmploye(@RequestBody Document document) {
			documentService.create(document);
		}
		
		@PutMapping
		public void updateEmploye(@RequestBody Document document) {
			documentService.update(document);
		}
		
		@DeleteMapping("/{id}")
		public void deleteEmploye(@PathVariable int id) {
			Document doc =documentService.findById(id);
			documentService.delete(doc);
		}

}
