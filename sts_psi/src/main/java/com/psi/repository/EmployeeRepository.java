package com.psi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
