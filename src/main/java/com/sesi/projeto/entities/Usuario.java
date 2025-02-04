package com.sesi.projeto.entities;

import java.util.ArrayList;
import java.util.List;

import com.sesi.projeto.dto.UsuarioDTO;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private String papeis;
	
	
	@OneToMany(mappedBy= "cliente")
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public Usuario() {
		
	}
	
	public void Usuario(Long id, String nome, String email, String telefone, String senha, String papeis) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.senha = senha;
		this.papeis = papeis;
	}
	
	public void Usuario(UsuarioDTO dto) {
		this.id = dto.id();
		this.nome = dto.nome();
		this.email = dto.email();
		this.telefone = dto.telefone();
		this.senha = dto.senha();
		this.papeis = dto.papeis();
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPapeis() {
		return papeis;
	}

	public void setPapeis(String papeis) {
		this.papeis = papeis;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	

}
