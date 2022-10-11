package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.DepartmentDao;
import com.example.model.EmpTransitionDao;
import com.example.model.EmployeeDao;
import com.example.model.EmployeeDto;
import com.example.repository.DeptRepository;
import com.example.repository.EmpRepository;
import com.example.repository.TransitionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpDetailsService {
	
	@Autowired
	private EmpRepository empDao;
	
	@Autowired
	private DeptRepository deptDao;
	
	@Autowired
	private TransitionRepository transitionDao;
	
	public String getDepartmentName(long id) {
		return deptDao.findByDeptId(id).getDeptName();
	}
	
	public String getTransitionName(long id) {
		return transitionDao.findByTransitionId(id).getTransitionName();
	}
	
	public List<EmployeeDto> findAll() {
		
		List<EmployeeDto> allEmployees = new ArrayList<>();
		
		for (EmployeeDao employeeDao : empDao.findAll()) {
			//if (employeeDao.getEmpStatus() != "Deleted") {
				EmployeeDto emp = new EmployeeDto();
				if ((Long)employeeDao.getEmpId() != null)
				emp.setEmpId(employeeDao.getEmpId());
				if (employeeDao.getFirstname()!=null)
				emp.setFirstname(employeeDao.getFirstname());
				if (employeeDao.getLastname()!=null)
				emp.setLastname(employeeDao.getLastname());
				
				if (employeeDao.getMiddlename()!=null)
				emp.setMiddlename(employeeDao.getMiddlename());
				if (employeeDao.getEmail()!=null)
				emp.setEmail(employeeDao.getEmail());
				
				if (employeeDao.getEmpType()!=null)
				emp.setEmpType(employeeDao.getEmpType());
				
				if ((Long)employeeDao.getDept().getDeptId() != null)
				emp.setDeptString(getDepartmentName(employeeDao.getDept().getDeptId()));				
				if ((Long)employeeDao.getTransition().getTransitionId() != null)
				emp.setEmpStatus(getTransitionName(employeeDao.getTransition().getTransitionId()));	
				
				allEmployees.add(emp);
		
		}
		
		return allEmployees;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public EmployeeDao save(EmployeeDto emp) {
		DepartmentDao newDept = new DepartmentDao();
		newDept.setDeptId(emp.getDeptId());
		
		EmpTransitionDao newTran = new EmpTransitionDao();
		newTran.setTransitionId(emp.getTransitionId());
		
		EmployeeDao newEmp = new EmployeeDao();
		
		Long empId = emp.getEmpId();		
		if (empId != null && !empId.equals("")) {
			newEmp.setEmpId(emp.getEmpId());
			newEmp.setEmpStatus("Acitive");
		} else {
			newEmp.setEmpStatus("Acitive");
		}	
		
		newEmp.setFirstname(emp.getFirstname());
		newEmp.setMiddlename(emp.getMiddlename());
		newEmp.setLastname(emp.getLastname());
		newEmp.setEmail(emp.getEmail());
		newEmp.setEmpStatus(emp.getEmpStatus());
		newEmp.setEmpType(emp.getEmpType());
		newEmp.setEndDate(emp.getEndDate());
		newEmp.setHireDate(emp.getHireDate());
		newEmp.setSource(emp.getSource());
		newEmp.setWorkPhone(emp.getWorkPhone());
		newEmp.setShift(emp.getShift());
		newEmp.setBloodGroup(emp.getBloodGroup());
		newEmp.setSpouseName(emp.getSpouseName());
		newEmp.setFatherName(emp.getFatherName());
		newEmp.setMotherName(emp.getMotherName());
		newEmp.setMobile(emp.getMobile());
		newEmp.setOtherEmail(emp.getOtherEmail());
		newEmp.setNationality(emp.getNationality());
		newEmp.setDateOfBirth(emp.getDateOfBirth());
		newEmp.setGender(emp.getGender());
		newEmp.setMaritalStatus(emp.getMaritalStatus());
		newEmp.setDrivingLicense(emp.getDrivingLicense());
		newEmp.setWebsite(emp.getWebsite());
		newEmp.setAddress1(emp.getAddress1());
		newEmp.setAddress2(emp.getAddress2());
		newEmp.setCity(emp.getCity());
		newEmp.setCountry(emp.getCountry());
		newEmp.setState(emp.getState());
		newEmp.setZipCode(emp.getZipCode());
		newEmp.setDesignation(emp.getDesignation());
		newEmp.setBio(emp.getBio());
		newEmp.setDept(newDept);
		newEmp.setTransition(newTran);
		return empDao.save(newEmp);
	}
	
	public EmployeeDao update(EmployeeDto emp) {
		DepartmentDao newDept = new DepartmentDao();
		newDept.setDeptId(emp.getDeptId());
		
		EmployeeDao newEmp = new EmployeeDao();
		newEmp.setEmpId(emp.getEmpId());
		
		EmpTransitionDao newTran = new EmpTransitionDao();
		newTran.setTransitionId(emp.getTransitionId());
				
		newEmp.setEmpStatus("Deleted");
				
		newEmp.setDept(newDept);
		newEmp.setTransition(newTran);
		
		return empDao.save(newEmp);
	}
	
	public void delete(long id) {
		EmployeeDao newEmp = new EmployeeDao();
		newEmp.setEmpId(id);
		empDao.delete(newEmp);
	}

}