package com.example.repository;
import com.example.model.EmployeeDao;

import org.springframework.data.repository.CrudRepository;

public interface EmpRepository extends CrudRepository<EmployeeDao, Integer> {
	EmployeeDao findByFirstname(String firstname);
	EmployeeDao findByEmpId(Long empId);
}