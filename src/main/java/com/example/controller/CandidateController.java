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

import com.example.model.CandidateDto;
import com.example.service.CandidateDetailsService;

@RestController
@CrossOrigin()
public class CandidateController {
	
	@Autowired
	private CandidateDetailsService candidateDetailsService;
	
    @RequestMapping(value = "/saveCandidate", method = RequestMethod.POST)
    public ResponseEntity<?> saveCandidate(@RequestBody CandidateDto candidate) throws Exception {
		return ResponseEntity.ok(candidateDetailsService.save(candidate));
	}
    
    @RequestMapping(value = "/deleteCandidate", method = RequestMethod.POST)
    public ResponseEntity<?> deleteCandidate(@RequestBody CandidateDto candidate) throws Exception {
		return ResponseEntity.ok(candidateDetailsService.save(candidate));
	}
    
    @GetMapping("/allCandidates")
    public List<CandidateDto> allCandidates() {
        return candidateDetailsService.findAll();
    }

}