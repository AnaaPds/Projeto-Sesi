package com.sesi.projeto.entities;

import com.sesi.projeto.dto.CategoriaDTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public Categoria(CategoriaDTO c) {
		this.nome = c.nome();
		
	}
	
	public Categoria(Long id, String nome) {
		this.nome = nome;
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
