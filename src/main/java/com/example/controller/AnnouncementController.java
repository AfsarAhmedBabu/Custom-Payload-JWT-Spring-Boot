package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AnnouncementDto;

import com.example.service.AnnouncementDetailsService;

@RestController
@CrossOrigin()
public class AnnouncementController {
	
	@Autowired
	private AnnouncementDetailsService announcementDetailsService;
	
    @RequestMapping(value = "/saveAnnouncement", method = RequestMethod.POST)
    public ResponseEntity<?> saveAnnouncement(@RequestBody AnnouncementDto announcement) throws Exception {
		return ResponseEntity.ok(announcementDetailsService.save(announcement));
	}
    
    @RequestMapping(value = "/deleteAnnouncement", method = RequestMethod.POST)
    public ResponseEntity<?> deleteAnnouncement(@RequestBody AnnouncementDto announcement) throws Exception {
		return ResponseEntity.ok(announcementDetailsService.save(announcement));
	}
    
    @GetMapping("/allAnnouncements")
    public List<AnnouncementDto> allAnnouncements() {
        return announcementDetailsService.findAll();
    }

}