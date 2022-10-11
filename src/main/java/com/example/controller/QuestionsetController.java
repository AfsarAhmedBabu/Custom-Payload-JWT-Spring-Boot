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

import com.example.model.QuestionsetDto;
import com.example.service.QuestionsetDetailsService;

@RestController
@CrossOrigin()
public class QuestionsetController {
	
	@Autowired
	private QuestionsetDetailsService questionsetDetailsService;
	
    @RequestMapping(value = "/saveQuestionset", method = RequestMethod.POST)
    public ResponseEntity<?> addQuestionset(@RequestBody QuestionsetDto questionset) throws Exception {
		return ResponseEntity.ok(questionsetDetailsService.save(questionset));
	}
    
    @RequestMapping(value = "/deleteQuestionset", method = RequestMethod.POST)
    public ResponseEntity<?> updateQuestionset(@RequestBody QuestionsetDto questionset) throws Exception {
		return ResponseEntity.ok(questionsetDetailsService.save(questionset));
	}
    
    @GetMapping("/allQuestionsets")
    public List<QuestionsetDto> allQuestionsets() {
        return questionsetDetailsService.findAll();
    }

}