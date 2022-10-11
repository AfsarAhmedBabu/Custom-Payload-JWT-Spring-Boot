package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.EmployeeDto;
import com.example.service.EmpDetailsService;

@RestController
@CrossOrigin()
public class EmployeeController {
	
	@Autowired
	private EmpDetailsService empDetailsService;
	
    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
    public ResponseEntity<?> addEmployee(@RequestBody EmployeeDto emp) throws Exception {
		return ResponseEntity.ok(empDetailsService.save(emp));
	}
    
    @RequestMapping(value = "/updateEmployee", method = RequestMethod.POST)
    public ResponseEntity<?> updateEmployee(@RequestBody EmployeeDto emp) throws Exception {
		return ResponseEntity.ok(empDetailsService.update(emp));
	}
   
    @DeleteMapping(path = { "/employee/{id}" })
    public void deleteEmployee(@PathVariable("id") int id) throws Exception {
		empDetailsService.delete(id);
	}
    
    @GetMapping("/employees")
    public List<EmployeeDto> allEmployees() {
        return empDetailsService.findAll();
    }
    
}
