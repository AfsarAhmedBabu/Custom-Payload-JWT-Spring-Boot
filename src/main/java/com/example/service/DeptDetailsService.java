package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.DepartmentDao;
import com.example.model.DepartmentDto;
import com.example.model.OrganizationDao;
import com.example.repository.DeptRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptDetailsService {
	
	@Autowired
	private DeptRepository deptDao;
	
	public List<DepartmentDto> findAll() {
		
		List<DepartmentDto> allDepartments = new ArrayList<>();
		
		for (DepartmentDao departmentDao : deptDao.findAll()) {
			DepartmentDto dept = new DepartmentDto();
			if ((Long) departmentDao.getDeptId() != null)
				dept.setDeptId(departmentDao.getDeptId());
			if (departmentDao.getDeptName() != null)
				dept.setDeptName(departmentDao.getDeptName());
			if (departmentDao.getDeptHead() != null)
				dept.setDeptHead(departmentDao.getDeptHead());
			if (departmentDao.getDeptHead() != null)
				dept.setDeptParent(departmentDao.getDeptParent().getOrgId());
			
			allDepartments.add(dept);
		}
		
		return allDepartments;
	}
	
	public DepartmentDao save(DepartmentDto dept) {
		OrganizationDao org = new OrganizationDao();
		org.setOrgId(dept.getDeptParent());
		DepartmentDao newDept = new DepartmentDao();
		newDept.setDeptId(dept.getDeptId());
		newDept.setDeptName(dept.getDeptName());
		newDept.setDeptHead(dept.getDeptHead());
		newDept.setDeptParent(org);
		return deptDao.save(newDept);
	}
	
	public String update(DepartmentDto dept) {
		OrganizationDao org = new OrganizationDao();
		org.setOrgId(dept.getDeptParent());
		DepartmentDao newDept = new DepartmentDao();
		newDept.setDeptId(dept.getDeptId());
		newDept.setDeptName(dept.getDeptName());
		newDept.setDeptHead(dept.getDeptHead());
		newDept.setDeptParent(org);
		deptDao.save(newDept);
		return "Department Successfully Updated.";
	}
	
	public String delete(DepartmentDto dept) {
		DepartmentDao newDept = new DepartmentDao();
		newDept.setDeptId(dept.getDeptId());
		deptDao.delete(newDept);
		return "Department Successfully Deleted.";
	}

}