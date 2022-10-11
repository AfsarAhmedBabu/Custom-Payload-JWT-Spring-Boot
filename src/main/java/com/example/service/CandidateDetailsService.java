package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.CandidateDao;
import com.example.model.CandidateDto;

import com.example.repository.CandidateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateDetailsService {
	
	@Autowired
	private CandidateRepository candidateDao;
	
	public List<CandidateDto> findAll() {
		
		List<CandidateDto> allCandidates = new ArrayList<>();
		
		for (CandidateDao candidateDao : candidateDao.findAll()) {
			
			CandidateDto candidate = new CandidateDto();
			
			if ((Long) candidateDao.getCandidateId() != null)
				candidate.setCandidateId(candidateDao.getCandidateId());
			if (candidateDao.getFirstname() != null)
				candidate.setFirstname(candidateDao.getFirstname());
			if (candidateDao.getLastname() != null)
				candidate.setLastname(candidateDao.getLastname());
			if (candidateDao.getEmail() != null)
				candidate.setEmail(candidateDao.getEmail());
			if (candidateDao.getMobile() != null)
				candidate.setMobile(candidateDao.getMobile());
			
			if (candidateDao.getDateOfBirth() != null)
				candidate.setDateOfBirth(candidateDao.getDateOfBirth());
			if (candidateDao.getGender() != null)
				candidate.setGender(candidateDao.getGender());
			if (candidateDao.getMaritalStatus() != null)
				candidate.setMaritalStatus(candidateDao.getMaritalStatus());
			if (candidateDao.getDrivingLicense() != null)
				candidate.setDrivingLicense(candidateDao.getDrivingLicense());
			if (candidateDao.getBio() != null)
				candidate.setBio(candidateDao.getBio());
			
			allCandidates.add(candidate);
		}
		
		return allCandidates;
	}
	
	public CandidateDao save(CandidateDto candidateDto) {
		
		CandidateDao candidate = new CandidateDao();
		
		if ((Long) candidateDto.getCandidateId() != null)
			candidate.setCandidateId(candidateDto.getCandidateId());
		if (candidateDto.getFirstname() != null)
			candidate.setFirstname(candidateDto.getFirstname());
		if (candidateDto.getLastname() != null)
			candidate.setLastname(candidateDto.getLastname());
		if (candidateDto.getEmail() != null)
			candidate.setEmail(candidateDto.getEmail());
		if (candidateDto.getMobile() != null)
			candidate.setMobile(candidateDto.getMobile());
		if (candidateDto.getDateOfBirth() != null)
			candidate.setDateOfBirth(candidateDto.getDateOfBirth());
		if (candidateDto.getGender() != null)
			candidate.setGender(candidateDto.getGender());
		if (candidateDto.getMaritalStatus() != null)
			candidate.setMaritalStatus(candidateDto.getMaritalStatus());
		if (candidateDto.getDrivingLicense() != null)
			candidate.setDrivingLicense(candidateDto.getDrivingLicense());
		if (candidateDto.getBio() != null)
			candidate.setBio(candidateDto.getBio());

		return candidateDao.save(candidate);	
	}
	
	public CandidateDao update(CandidateDto candidateDto) {
		
		CandidateDao candidate = new CandidateDao();
		
		if ((Long) candidateDto.getCandidateId() != null)
			candidate.setCandidateId(candidateDto.getCandidateId());
		if (candidateDto.getFirstname() != null)
			candidate.setFirstname(candidateDto.getFirstname());
		if (candidateDto.getLastname() != null)
			candidate.setLastname(candidateDto.getLastname());
		if (candidateDto.getEmail() != null)
			candidate.setEmail(candidateDto.getEmail());
		if (candidateDto.getMobile() != null)
			candidate.setMobile(candidateDto.getMobile());
		if (candidateDto.getDateOfBirth() != null)
			candidate.setDateOfBirth(candidateDto.getDateOfBirth());
		
			candidate.setGender("Deleted");
		if (candidateDto.getMaritalStatus() != null)
			candidate.setMaritalStatus(candidateDto.getMaritalStatus());
		if (candidateDto.getDrivingLicense() != null)
			candidate.setDrivingLicense(candidateDto.getDrivingLicense());
		if (candidateDto.getBio() != null)
			candidate.setBio(candidateDto.getBio());

		return candidateDao.save(candidate);
		
	}

}