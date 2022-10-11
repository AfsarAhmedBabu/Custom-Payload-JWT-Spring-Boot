package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.OpeningDao;
import com.example.model.OpeningDto;
import com.example.repository.OpeningRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpeningDetailsService {
	
	@Autowired
	private OpeningRepository openingDao;
	
	public List<OpeningDto> findAll() {
		
		List<OpeningDto> allOpenings = new ArrayList<>();
		
		for (OpeningDao openingDao : openingDao.findAll()) {
			
			if (openingDao.getEmpType() != null && openingDao.getEmpType() != "Deleted") {
			
			OpeningDto opening = new OpeningDto();
			
			if ((Long) openingDao.getOpeningId() != null)
				opening.setOpeningId(openingDao.getOpeningId());
			if (openingDao.getPositionTitle() != null)
				opening.setPositionTitle(openingDao.getPositionTitle());
			if (openingDao.getPositionDesc() != null)
				opening.setPositionDesc(openingDao.getPositionDesc());
			if ((Long) openingDao.getDeptId() != null)
				opening.setDeptId(openingDao.getDeptId());
			if (openingDao.getEmpType() != null)
				opening.setEmpType(openingDao.getEmpType());
			if (openingDao.getExperience() != null)
				opening.setExperience(openingDao.getExperience());
			if (openingDao.getDeadline() != null)
				opening.setDeadline(openingDao.getDeadline());
			if (openingDao.getLocation() != null)
				opening.setLocation(openingDao.getLocation());
			if (openingDao.getVacancies() != null)
				opening.setVacancies(openingDao.getVacancies());
			if (openingDao.getAddress1() != null)
				opening.setAddress1(openingDao.getAddress1());
			if (openingDao.getAddress2() != null)
				opening.setAddress2(openingDao.getAddress2());
			if (openingDao.getCity() != null)
				opening.setCity(openingDao.getCity());
			if (openingDao.getState() != null)
				opening.setState(openingDao.getState());
			if (openingDao.getCountry() != null)
				opening.setCountry(openingDao.getCountry());
			if (openingDao.getZipCode() != null)
				opening.setZipCode(openingDao.getZipCode());
			if (openingDao.getSalaryType() != null)
				opening.setSalaryType(openingDao.getSalaryType());
			if (openingDao.getQuestionset() != null)
				opening.setQuestionset(openingDao.getQuestionset());
			
			allOpenings.add(opening);
			
			}
			
		}
		
		return allOpenings;
	}
	
	public OpeningDao save(OpeningDto openingDto) {
		OpeningDao opening = new OpeningDao();
		
			if ((Long) openingDto.getOpeningId() != null)
				opening.setOpeningId(openingDto.getOpeningId());
			if (openingDto.getPositionTitle() != null)
				opening.setPositionTitle(openingDto.getPositionTitle());
			if (openingDto.getPositionDesc() != null)
				opening.setPositionDesc(openingDto.getPositionDesc());
			if ((Long) openingDto.getDeptId() != null)
				opening.setDeptId(openingDto.getDeptId());
			if (openingDto.getEmpType() != null)
				opening.setEmpType(openingDto.getEmpType());
			if (openingDto.getExperience() != null)
				opening.setExperience(openingDto.getExperience());
			if (openingDto.getDeadline() != null)
				opening.setDeadline(openingDto.getDeadline());
			if (openingDto.getLocation() != null)
				opening.setLocation(openingDto.getLocation());
			if (openingDto.getVacancies() != null)
				opening.setVacancies(openingDto.getVacancies());
			if (openingDto.getAddress1() != null)
				opening.setAddress1(openingDto.getAddress1());
			if (openingDto.getAddress2() != null)
				opening.setAddress2(openingDto.getAddress2());
			if (openingDto.getCity() != null)
				opening.setCity(openingDto.getCity());
			if (openingDto.getState() != null)
				opening.setState(openingDto.getState());
			if (openingDto.getCountry() != null)
				opening.setCountry(openingDto.getCountry());
			if (openingDto.getZipCode() != null)
				opening.setZipCode(openingDto.getZipCode());
			if (openingDto.getSalaryType() != null)
				opening.setSalaryType(openingDto.getSalaryType());
			if (openingDto.getQuestionset() != null)
				opening.setQuestionset(openingDto.getQuestionset());
			return openingDao.save(opening);
		
	}
	
	public OpeningDto getOpening(Long openingId) {
			
		OpeningDto opening = new OpeningDto();
		
		String pTitle =  openingDao.findByOpeningId(openingId).getPositionTitle();
		String pDesc =  openingDao.findByOpeningId(openingId).getPositionDesc();
		String empType = openingDao.findByOpeningId(openingId).getEmpType();
		
		opening.setOpeningId(openingId);
		opening.setEmpType(empType);
		opening.setPositionTitle(pTitle);
		opening.setPositionDesc(pDesc);
		
		return opening;
		
	}	
	
	public OpeningDao update(OpeningDto openingDto) {
		OpeningDao opening = new OpeningDao();
		if ((Long) openingDto.getOpeningId() != null)
			opening.setOpeningId(openingDto.getOpeningId());
		if (openingDto.getPositionTitle() != null)
			opening.setPositionTitle(openingDto.getPositionTitle());
		if (openingDto.getPositionDesc() != null)
			opening.setPositionDesc(openingDto.getPositionDesc());
		if ((Long) openingDto.getDeptId() != null)
			opening.setDeptId(openingDto.getDeptId());
		//if (openingDto.getEmpType() != null)
			opening.setEmpType("Deleted");
		if (openingDto.getExperience() != null)
			opening.setExperience(openingDto.getExperience());
		if (openingDto.getDeadline() != null)
			opening.setDeadline(openingDto.getDeadline());
		if (openingDto.getLocation() != null)
			opening.setLocation(openingDto.getLocation());
		if (openingDto.getVacancies() != null)
			opening.setVacancies(openingDto.getVacancies());
		if (openingDto.getAddress1() != null)
			opening.setAddress1(openingDto.getAddress1());
		if (openingDto.getAddress2() != null)
			opening.setAddress2(openingDto.getAddress2());
		if (openingDto.getCity() != null)
			opening.setCity(openingDto.getCity());
		if (openingDto.getState() != null)
			opening.setState(openingDto.getState());
		if (openingDto.getCountry() != null)
			opening.setCountry(openingDto.getCountry());
		if (openingDto.getZipCode() != null)
			opening.setZipCode(openingDto.getZipCode());
		if (openingDto.getSalaryType() != null)
			opening.setSalaryType(openingDto.getSalaryType());
		if (openingDto.getQuestionset() != null)
			opening.setQuestionset(openingDto.getQuestionset());
		return openingDao.save(opening);
	}

}