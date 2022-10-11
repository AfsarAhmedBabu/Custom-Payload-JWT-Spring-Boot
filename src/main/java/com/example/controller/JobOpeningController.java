package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.OpeningDto;
import com.example.service.OpeningDetailsService;

@RestController
@CrossOrigin()
public class JobOpeningController {
	
	@Autowired
	private OpeningDetailsService openingDetailsService;
	
    @RequestMapping(value = "/saveOpening", method = RequestMethod.POST)
    public ResponseEntity<?> saveOpening(@RequestBody OpeningDto opening) throws Exception {
		return ResponseEntity.ok(openingDetailsService.save(opening));
	}
    
    @RequestMapping(value = "/deleteOpening", method = RequestMethod.POST)
    public ResponseEntity<?> deleteOpening(@RequestBody OpeningDto opening) throws Exception {
		return ResponseEntity.ok(openingDetailsService.save(opening));
	}
    
    @GetMapping("/allOpenings")
    public List<OpeningDto> allOpenings() {
        return openingDetailsService.findAll();
    }
    
    @GetMapping("/getOpening")
    public OpeningDto getOpening(@RequestParam Long openingId) throws Exception {
        return openingDetailsService.getOpening(openingId);
    }

}