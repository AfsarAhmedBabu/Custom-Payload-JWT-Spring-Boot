package com.example.repository;
import com.example.model.OpeningDao;

import org.springframework.data.repository.CrudRepository;

public interface OpeningRepository extends CrudRepository<OpeningDao, Integer> {
	OpeningDao findByPositionTitle(String OpeningTitle);
	OpeningDao findByOpeningId(Long openingId);
}