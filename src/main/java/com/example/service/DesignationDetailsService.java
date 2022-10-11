package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.model.DesignationDao;
import com.example.model.DesignationDto;
import com.example.repository.DesignationRepository;
import org.springframework.stereotype.Service;
@Service
public class DesignationDetailsService {
	
	@Autowired
	private DesignationRepository designationRepo;
	@Autowired
	private DesignationRepository designationRepository;
	public DesignationDao save(DesignationDto dto){
		DesignationDao dao = new DesignationDao();
		dao.setId(dto.getSeqId());
		dao.setDesignation_id(dto.getDesignationId());
		dao.setDesignation_name(dto.getDesignationName());
		dao.setDescription(dto.getDescription());
		return designationRepository.save(dao);
	}
	
	public List<DesignationDto> findAllDesignations() {
		List<DesignationDto> designationLists = new ArrayList<>();
		for (DesignationDao dao : designationRepo.findAll()) {
			DesignationDto dto = new DesignationDto();
			dto.setSeqId(dao.getId());
			dto.setDesignationId(dao.getDesignation_id());
			dto.setDesignationName(dao.getDesignation_name());
			dto.setDescription(dao.getDescription());
			designationLists.add(dto);
		}
		return designationLists;
	}

}
