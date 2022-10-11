package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.AnnouncementDao;
import com.example.model.AnnouncementDto;

import com.example.repository.AnnouncementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnouncementDetailsService {
	
	@Autowired
	private AnnouncementRepository announcementDao;
	
	public List<AnnouncementDto> findAll() {
		
		List<AnnouncementDto> allAnnouncements = new ArrayList<>();
		
		for (AnnouncementDao announcement : announcementDao.findAll()) {
			
			AnnouncementDto newAnnouncement = new AnnouncementDto();
			
			if ((Long) announcement.getAnnouncementId() != null)
				newAnnouncement.setAnnouncementId(announcement.getAnnouncementId());
			
			if (announcement.getAnnouncementType() != null)
				newAnnouncement.setAnnouncementType(announcement.getAnnouncementType());
			
			if (announcement.getAnnouncementName() != null)
				newAnnouncement.setAnnouncementName(announcement.getAnnouncementName());
			
			if (announcement.getAnnouncementDesc() != null)
				newAnnouncement.setAnnouncementDesc(announcement.getAnnouncementDesc());
			
			allAnnouncements.add(newAnnouncement);
		}
		
		return allAnnouncements;
	}
	
	public AnnouncementDao save(AnnouncementDto announcement) {
		
		AnnouncementDao newAnnouncement = new AnnouncementDao();
		
		if ((Long) announcement.getAnnouncementId() != null)
			newAnnouncement.setAnnouncementId(announcement.getAnnouncementId());
		
		if (announcement.getAnnouncementType() != null)
			newAnnouncement.setAnnouncementType(announcement.getAnnouncementType());
		
		if (announcement.getAnnouncementName() != null)
			newAnnouncement.setAnnouncementName(announcement.getAnnouncementName());
		
		if (announcement.getAnnouncementDesc() != null)
			newAnnouncement.setAnnouncementDesc(announcement.getAnnouncementDesc());
				
		return announcementDao.save(newAnnouncement);
	}

}