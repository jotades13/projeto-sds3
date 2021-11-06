package com.dvsuperior.dsvendas.dto;

import java.io.Serializable;

import com.dvsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
		
	}

	// Houve uma troca de parametros sellerName para Seller
	// pós segundo o professro nélio o postgresql não aceita 
	// o agrupamento só pelo nome temos que usar o seller
	// então fica uma dúvida em relação as camadas
	// ou seja o DTO acessa as entidades. (Irei introduzir esta citação no grupo)
	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
