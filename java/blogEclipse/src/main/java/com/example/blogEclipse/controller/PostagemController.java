package com.example.blogEclipse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blogEclipse.model.Postagem;
import com.example.blogEclipse.repository.PostagemRepository;

@RestController
@RequestMapping("/postagens")
@CrossOrigin("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Postagem>> GetAll(){
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Postagem>> getById(@PathVariable Long id){
		
		return ResponseEntity.ok(repository.findById(id));
	}
	
	@GetMapping("/titulo/{titulo}")
	
	public ResponseEntity <List<Postagem>> getByTitulo(@PathVariable String titulo){
		
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	
	}
	
	
	@GetMapping("/autor/{autor}")
	
	public ResponseEntity<List<Postagem>> getByAutor(@PathVariable String autor) {
		
		return ResponseEntity.ok(repository.findAllByAutorContainingIgnoreCase(autor));
	}
	
	
	
	
}