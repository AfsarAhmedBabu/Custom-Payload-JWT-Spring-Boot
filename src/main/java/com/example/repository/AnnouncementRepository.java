package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.AnnouncementDao;

public interface AnnouncementRepository extends CrudRepository<AnnouncementDao, Integer> {
	AnnouncementDao findByAnnouncementName(String announcementName);
	AnnouncementDao findByAnnouncementId(Long announcementId);
}