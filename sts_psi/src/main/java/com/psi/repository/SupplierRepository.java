package com.psi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psi.entity.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Long>{

}
