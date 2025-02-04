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

import com.sesi.projeto.dto.ItemDoPedidoDTO;
import com.sesi.projeto.entities.ItemDoPedido;
import com.sesi.projeto.entities.Produto;
import com.sesi.projeto.repository.ItemDoPedidoRepository;

@RestController
@RequestMapping("itemdopedido")
public class ItemDoPedidoController {
	
	@Autowired
	ItemDoPedidoRepository repo;
	
	@GetMapping
	public ResponseEntity<List<ItemDoPedido>> mostrarTodos() {
		List<ItemDoPedido> prod = repo.findAll();
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> mostrarPorId(@PathVariable UUID id){
		ItemDoPedido prod = repo.getById(id);
		return ResponseEntity.ok(prod);
	}
	
	
	@PostMapping
    public ResponseEntity<ItemDoPedido> criar(@RequestBody ItemDoPedidoDTO dto) {
            ItemDoPedido prod = new ItemDoPedido();
            return ResponseEntity.ok(prod);
    }
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable UUID id) {
        
            repo.deleteById(id);
            return ResponseEntity.noContent().build();
        
        
        }

}
