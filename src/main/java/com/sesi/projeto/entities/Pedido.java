package com.sesi.projeto.entities;

import java.time.Instant;

import com.sesi.projeto.dto.ProdutoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_produto")
public class Pedido {
		

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private Instant momento;
		private StatusDoPedido status;
		
		public Pedido() {
			
		}
		
		public Pedido(PedidoDTO e) {
			this.momento = e.momento();
			this.status = e.status();
		}
		
		public Pedido(PedidoDTO p) {
			this.id = id;
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
			this.senha = senha;
			this.papeis = papeis;
			
		}
		
		public void Pedido(Long id, instant momento, double preco, String descricao) {
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
