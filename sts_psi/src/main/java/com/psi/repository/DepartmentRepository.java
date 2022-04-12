package com.psi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psi.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
