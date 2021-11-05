package com.dvsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dsvendas.entities.Seller;

public interface SellerRepositoy extends JpaRepository<Seller, Long> {

}
