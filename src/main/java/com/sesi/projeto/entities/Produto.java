package com.sesi.projeto.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sesi.projeto.dto.ProdutoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_produto")
public class Produto {
	
	@ManyToMany
	@JoinTable (name="tb_produto_categoria",
	
	joinColumns = @JoinColumn(name="produto_id"),
	inverseJoinColumns = @JoinColumn(name="categoria_id"))
	private Set<Categoria>categorias=new HashSet<>();
	
	@OneToMany(mappedBy = "id.produto")
	private Set< ItemDoPedido> items = new HashSet<>();
	public Set<ItemDoPedido> getItems(){
		return items;
	}
	
	public List<Pedido>getPedido(){
		return items.stream().map(x -> x.getPedido()).toList();
	}
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double preco;
	private String descricao;
	private String imgURL;
	
	public Produto() {
		
	}
	
	public Produto(ProdutoDTO dto) {
		this.nome = dto.nome();
		this.preco = dto.preco();
		this.descricao = dto.descricao();
		this.descricao = dto.imgURL();
	}
	
	public Produto(Long id, String nome, double preco, String descricao) {
	this.id = id;
	this.nome = nome;
	this.preco = preco;
	this.descricao = descricao;
	this.imgURL = imgURL;
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getimgURL() {
		return imgURL;
	}
	
	public void setimgURL(String imgURL) {
		this.imgURL = imgURL;
	}





}
