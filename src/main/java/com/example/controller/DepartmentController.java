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
import com.example.model.EmployeeDto;
import com.example.service.DeptDetailsService;

@RestController
@CrossOrigin()
public class DepartmentController {
	
	@Autowired
	private DeptDetailsService deptDetailsService;
	
    @RequestMapping(value = "/addDepartment", method = RequestMethod.POST)
    public ResponseEntity<?> addCompany(@RequestBody DepartmentDto dept) throws Exception {
		return ResponseEntity.ok(deptDetailsService.save(dept));
	}
    
    @RequestMapping(value = "/updateDepartment", method = RequestMethod.POST)
    public ResponseEntity<?> updateCompany(@RequestBody DepartmentDto dept) throws Exception {
		return ResponseEntity.ok(deptDetailsService.update(dept));
	}
    
    @RequestMapping(value = "/deleteDepartment", method = RequestMethod.POST)
    public ResponseEntity<?> deleteCompany(@RequestBody DepartmentDto dept) throws Exception {
		return ResponseEntity.ok(deptDetailsService.delete(dept));
	}
    
    @GetMapping("/departments")
    public List<DepartmentDto> allDepartments() {
        return deptDetailsService.findAll();
    }
}