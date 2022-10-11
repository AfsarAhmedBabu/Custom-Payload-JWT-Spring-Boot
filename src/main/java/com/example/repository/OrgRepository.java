package com.example.repository;
import com.example.model.OrganizationDao;

import org.springframework.data.repository.CrudRepository;

public interface OrgRepository extends CrudRepository<OrganizationDao, Integer> {
	OrganizationDao findByOrgName(String orgName);
	OrganizationDao findByOrgId(Long orgId);
}
