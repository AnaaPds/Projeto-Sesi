package com.sesi.projeto.entities;

import java.util.HashSet;
import java.util.Set;

import com.sesi.projeto.dto.CategoriaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@ManyToMany(mappedBy="categorias")
	
	private Set<Produto>produtos=new HashSet<>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public Categoria() {
		
	}
	
	public void Categoria(Long id,String nome) {
		this.id = id;
		this.nome = nome;
		
	}
	
	public void Categoria(CategoriaDTO dto) {
		this.nome = dto.nome();
		this.id = dto.id();
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
