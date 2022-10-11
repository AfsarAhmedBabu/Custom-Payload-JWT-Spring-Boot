package com.example.repository;
import com.example.model.DepartmentDao;

import org.springframework.data.repository.CrudRepository;

public interface DeptRepository extends CrudRepository<DepartmentDao, Integer> {
	DepartmentDao findByDeptName(String orgName);
	DepartmentDao findByDeptId(Long orgId);
}