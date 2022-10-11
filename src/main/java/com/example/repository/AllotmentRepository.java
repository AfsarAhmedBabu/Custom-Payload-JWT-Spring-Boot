package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.AllotmentDao;

public interface AllotmentRepository extends CrudRepository<AllotmentDao, Integer> {
	AllotmentDao findByItemCode(String itemCode);
	AllotmentDao findByAllotmentId(Long allotmentId);
}