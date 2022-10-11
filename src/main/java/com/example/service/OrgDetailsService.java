package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.DepartmentDao;
import com.example.model.DepartmentDto;
import com.example.model.OrganizationDao;
import com.example.model.OrganizationDto;
import com.example.repository.OrgRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgDetailsService {
	
	@Autowired
	private OrgRepository orgDao;
	
	public List<OrganizationDto> findAll() {
		
		List<OrganizationDto> allOrganizations = new ArrayList<>();
		
		for (OrganizationDao organizationDao : orgDao.findAll()) {
			OrganizationDto org = new OrganizationDto();
			if ((Long) organizationDao.getOrgId() != null)
				org.setOrgId(organizationDao.getOrgId());
			if (organizationDao.getOrgName() != null)
				org.setOrgName(organizationDao.getOrgName());
			if (organizationDao.getOrgAddress() != null)
				org.setOrgAddress(organizationDao.getOrgAddress());
			if (organizationDao.getOrgPhone() != null)
				org.setOrgPhone(organizationDao.getOrgPhone());
			if (organizationDao.getOrgEmail() != null)
				org.setOrgEmail(organizationDao.getOrgEmail());
			
			allOrganizations.add(org);
		}
		
		return allOrganizations;
	}
	
	public OrganizationDao save(OrganizationDto org) {
		OrganizationDao newOrg = new OrganizationDao();
		newOrg.setOrgName(org.getOrgName());
		newOrg.setOrgAddress(org.getOrgAddress());
		newOrg.setOrgPhone(org.getOrgPhone());
		newOrg.setOrgEmail(org.getOrgEmail());
		return orgDao.save(newOrg);
	}
	
	public OrganizationDao update(OrganizationDto org) {
		OrganizationDao newOrg = new OrganizationDao();
		newOrg.setOrgId(org.getOrgId());
		newOrg.setOrgName(org.getOrgName());
		newOrg.setOrgAddress(org.getOrgAddress());
		newOrg.setOrgPhone(org.getOrgPhone());
		newOrg.setOrgEmail(org.getOrgEmail());
		return orgDao.save(newOrg);
	}
	
	public String delete(OrganizationDto org) {
		OrganizationDao newOrg = new OrganizationDao();
		newOrg.setOrgId(org.getOrgId());
		orgDao.delete(newOrg);
		return "Organization Successfully Deleted.";
	}

}
