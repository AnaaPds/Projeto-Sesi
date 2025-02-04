package com.sesi.projeto.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.dto.CategoriaDTO;
import com.sesi.projeto.entities.Categoria;
import com.sesi.projeto.repository.CategoriaRepository;

@RestController
@RequestMapping("categoria")
public class CategoriaController {
	
	@Autowired
	CategoriaRepository repo;
	
	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> mostrarTodos() {
		List<CategoriaDTO> prod = repo.findAll();
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable UUID id){
		CategoriaDTO prod = repo.getById(id);
		return ResponseEntity.ok(prod);
	}
	
	
	@PostMapping
    public ResponseEntity<Categoria> criar(@RequestBody CategoriaDTO dto) {
            Categoria prod = new Categoria();
            return ResponseEntity.ok(prod);
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        
            repo.deleteById(id);
            return ResponseEntity.noContent().build();
        
        
        }

}
