package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.QuestionsetDao;

public interface QuestionsetRepository extends CrudRepository<QuestionsetDao, Integer> {
	QuestionsetDao findBySetName(String setName);
	QuestionsetDao findBySetId(Long setId);
}