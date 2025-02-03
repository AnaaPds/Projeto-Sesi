package com.sesi.projeto.entities;

import com.sesi.projeto.dto.ItemDoPedidoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_itemdopedido")
public class ItemDoPedido {
	
	
		

		private String nome;
		private double preco;
		private String descricao;
		private String imgURL;
		
		public Produto() {
			
		}
		
		public ItemPedido(ItemDoPedidoDTO dto) {
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


}
