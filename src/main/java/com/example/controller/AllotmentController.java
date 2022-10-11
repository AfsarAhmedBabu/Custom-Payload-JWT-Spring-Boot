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

import com.example.model.AllotmentDto;
import com.example.service.AllotmentDetailsService;

@RestController
@CrossOrigin()
public class AllotmentController {
	
	@Autowired
	private AllotmentDetailsService allotmentDetailsService;
	
    @RequestMapping(value = "/saveAllotment", method = RequestMethod.POST)
    public ResponseEntity<?> saveAllotment(@RequestBody AllotmentDto allotment) throws Exception {
		return ResponseEntity.ok(allotmentDetailsService.save(allotment));
	}
    
    @RequestMapping(value = "/deleteAllotment", method = RequestMethod.POST)
    public ResponseEntity<?> deleteAllotment(@RequestBody AllotmentDto allotment) throws Exception {
		return ResponseEntity.ok(allotmentDetailsService.save(allotment));
	}
    
    @GetMapping("/allAllotments")
    public List<AllotmentDto> allAllotments() {
        return allotmentDetailsService.findAll();
    }

}