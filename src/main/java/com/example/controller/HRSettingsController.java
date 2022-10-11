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

import com.example.model.DesignationDao;
import com.example.model.DesignationDto;
import com.example.service.DesignationDetailsService;



@RestController
@CrossOrigin()
public class HRSettingsController {
	@Autowired private DesignationDetailsService detailsService;
	@RequestMapping(value = "/createDesignation", method = RequestMethod.POST)
    public ResponseEntity<DesignationDao> addDesignation(@RequestBody DesignationDto designationData) throws Exception {
		return ResponseEntity.ok(detailsService.save(designationData));
	}
	
	@GetMapping("/getDesignations")
    public List<DesignationDto> getAllDesignations() {
        return detailsService.findAllDesignations();
    }
	
}
