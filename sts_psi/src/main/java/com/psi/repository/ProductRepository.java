package com.psi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psi.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
