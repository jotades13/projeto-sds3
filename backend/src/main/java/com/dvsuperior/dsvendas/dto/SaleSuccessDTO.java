package com.dvsuperior.dsvendas.dto;

import java.io.Serializable;

import com.dvsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long visited;
	private Long deals;
	
	
	public SaleSuccessDTO() {
		
	}

	// Houve uma troca de parametros sellerName para Seller
	// pós segundo o professro nélio o postgresql não aceita 
	// o agrupamento só pelo nome temos que usar o seller
	// então fica uma dúvida em relação as camadas
	// ou seja o DTO acessa as entidades. (Irei introduzir esta citação no grupo)
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
		sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public SaleSuccessDTO(String sellerName, Long visited, Long deals) {
		this.sellerName = sellerName;
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
