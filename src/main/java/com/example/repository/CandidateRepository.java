package com.example.repository;
import com.example.model.CandidateDao;

import org.springframework.data.repository.CrudRepository;

public interface CandidateRepository extends CrudRepository<CandidateDao, Integer> {
	CandidateDao findByFirstname(String firstname);
	CandidateDao findByEmail(String email);
}