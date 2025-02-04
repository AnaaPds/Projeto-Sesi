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

import com.sesi.projeto.dto.PagamentoDTO;
import com.sesi.projeto.entities.Pagamento;
import com.sesi.projeto.repository.PagamentoRepository;

@RestController
@RequestMapping("pagamento")
public class PagamentoController {
	
	@Autowired
	PagamentoRepository repo;
	
	@GetMapping
	public ResponseEntity<List<PagamentoDTO>> mostrarTodos() {
		List<PagamentoDTO> prod = repo.findAll();
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable UUID id){
		PagamentoDTO prod = repo.getById(id);
		return ResponseEntity.ok(prod);
	}
	
	
	@PostMapping
    public ResponseEntity<Pagamento> criar(@RequestBody PagamentoDTO dto) {
            Pagamento prod = new Pagamento();
            return ResponseEntity.ok(prod);
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        
            repo.deleteById(id);
            return ResponseEntity.noContent().build();
        
        
        }

}
