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

import com.example.model.DepartmentDto;
import com.example.model.OrganizationDto;
import com.example.service.OrgDetailsService;

@RestController
@CrossOrigin()
public class OrganizationController {
	
	@Autowired
	private OrgDetailsService orgDetailsService;
	
    @RequestMapping(value = "/addOrganization", method = RequestMethod.POST)
    public ResponseEntity<?> addCompany(@RequestBody OrganizationDto org) throws Exception {
		return ResponseEntity.ok(orgDetailsService.save(org));
	}
    
    @RequestMapping(value = "/updateOrganization", method = RequestMethod.POST)
    public ResponseEntity<?> updateCompany(@RequestBody OrganizationDto org) throws Exception {
		return ResponseEntity.ok(orgDetailsService.update(org));
	}
    
    @RequestMapping(value = "/deleteOrganization", method = RequestMethod.POST)
    public ResponseEntity<?> deleteCompany(@RequestBody OrganizationDto org) throws Exception {
		return ResponseEntity.ok(orgDetailsService.delete(org));
	}
    
    @GetMapping("/organizations")
    public List<OrganizationDto> allOrganizations() {
        return orgDetailsService.findAll();
    }
    
}