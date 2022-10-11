package com.example.repository;
import com.example.model.EmpTransitionDao;

import org.springframework.data.repository.CrudRepository;

public interface TransitionRepository extends CrudRepository<EmpTransitionDao, Integer> {
	EmpTransitionDao findByTransitionName(String transitionName);
	EmpTransitionDao findByTransitionId(Long transitionId);
}