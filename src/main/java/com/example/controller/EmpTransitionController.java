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
import com.example.model.EmpTransitionDto;
import com.example.service.transitionDetailsService;

@RestController
@CrossOrigin()
public class EmpTransitionController {
	
	@Autowired
	private transitionDetailsService transitionDetailsService;
	
    @RequestMapping(value = "/addTransition", method = RequestMethod.POST)
    public ResponseEntity<?> addTransition(@RequestBody EmpTransitionDto transition) throws Exception {
		return ResponseEntity.ok(transitionDetailsService.save(transition));
	}
    
    @RequestMapping(value = "/updateTransition", method = RequestMethod.POST)
    public ResponseEntity<?> updateTransition(@RequestBody EmpTransitionDto transition) throws Exception {
		return ResponseEntity.ok(transitionDetailsService.update(transition));
	}
    
    @RequestMapping(value = "/deleteTransition", method = RequestMethod.POST)
    public ResponseEntity<?> deleteTransition(@RequestBody EmpTransitionDto transition) throws Exception {
		return ResponseEntity.ok(transitionDetailsService.delete(transition));
	}
    
    @GetMapping("/transitions")
    public List<EmpTransitionDto> allTransitions() {
        return transitionDetailsService.findAll();
    }

}