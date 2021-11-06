package com.dvsuperior.dsvendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dvsuperior.dsvendas.dto.SaleDTO;
import com.dvsuperior.dsvendas.entities.Sale;
import com.dvsuperior.dsvendas.repositories.SaleRepository;
import com.dvsuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly=true)
	public Page<SaleDTO> findAll(Pageable pageable){
		// a pesquisa de todos os vendedores é para que o hibernate não faça uma pesquisa 
		// a cada vendedor ao listar as vendas ou seja se houver 5 vendedores haveram 5 pesquisas
		// a cada vendedor não das vendas e sim dos venderes, pois na classe dos venderores existe
		// uma relação @ManyToOne  (a definição do professor nélio ficou um pouco adesejar. devo pesquisar melhor.)
		// caso haja 1000 vendedores o método não deve ser este.
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		// o Page aparti do java 8 já é um stream então muda o return
		//return result.stream().map(x -> new SaleDTO(x)).collect(Collectors.toList());
		return result.map(x -> new SaleDTO(x));
		
	}
}
