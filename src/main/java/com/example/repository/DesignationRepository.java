package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.DesignationDao;
public interface DesignationRepository extends JpaRepository<DesignationDao,Long> {
	
}
