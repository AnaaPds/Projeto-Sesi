package com.sesi.projeto.entities;

import com.sesi.projeto.dto.ItemDoPedidoDTO;

import jakarta.persistence.EmbeddedId;

public class ItemDoPedido {
	
	
	@EmbeddedId
	
	private ItemDoPedidoPK id = new ItemDoPedidoPK();
	
	private Integer quantidade;
	private Double preco;
	
		public ItemDoPedido() {
			
		}
		
		public ItemDoPedido(Pedido pedido, Produto produto, Integer quantidade, Double preco) {
			id.setPedido(pedido);
			id.setProduto(produto);
			this.quantidade = quantidade;
			this.preco = preco;
		}
		
		public Pedido getPedido() {
			return id.getPedido();
		}
		
		public void Pedido(Pedido pedido) {
			id.set  Pedido(pedido);
		}
		
		public void ItemDoPedido(Integer quantidade, Double preco) {
			this.quantidade = quantidade;
			this.preco = preco;
		}
		
		public void ItemPedido(ItemDoPedidoDTO dto) {
			this.quantidade = dto.quantidade();
			this.preco = dto.preco();
		}

		public Integer getQuantidade() {
			return quantidade;
		}

		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}

		public Double getPreco() {
			return preco;
		}

		public void setPreco(Double preco) {
			this.preco = preco;
		}
		
		
		
	


}
