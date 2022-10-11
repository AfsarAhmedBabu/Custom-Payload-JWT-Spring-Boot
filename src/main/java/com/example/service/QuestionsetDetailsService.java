package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.QuestionsetDao;
import com.example.model.QuestionsetDto;

import com.example.repository.QuestionsetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionsetDetailsService {
	
	@Autowired
	private QuestionsetRepository qsetDao;
	
	public List<QuestionsetDto> findAll() {
		
		List<QuestionsetDto> allQuestionset = new ArrayList<>();
		
		for (QuestionsetDao questionsetDao : qsetDao.findAll()) {
			
			QuestionsetDto question = new QuestionsetDto();
			
			if ((Long) questionsetDao.getSetId() != null)
				question.setSetId(questionsetDao.getSetId());
			if (questionsetDao.getSetName() != null)
				question.setSetName(questionsetDao.getSetName());
			if (questionsetDao.getQ1() != null)
				question.setQ1(questionsetDao.getQ1());
			if (questionsetDao.getQ2() != null)
				question.setQ2(questionsetDao.getQ2());
			if (questionsetDao.getQ3() != null)
				question.setQ3(questionsetDao.getQ3());
			if (questionsetDao.getQ4() != null)
				question.setQ4(questionsetDao.getQ4());
			
			allQuestionset.add(question);
		}
		
		return allQuestionset;
	}
	
	public QuestionsetDao save(QuestionsetDto questionsetDto) {
		
		QuestionsetDao question = new QuestionsetDao();
		
		if ((Long) questionsetDto.getSetId() != null)
			question.setSetId(questionsetDto.getSetId());
		if (questionsetDto.getSetName() != null)
			question.setSetName(questionsetDto.getSetName());
		if (questionsetDto.getQ1() != null)
			question.setQ1(questionsetDto.getQ1());
		if (questionsetDto.getQ2() != null)
			question.setQ2(questionsetDto.getQ2());
		if (questionsetDto.getQ3() != null)
			question.setQ3(questionsetDto.getQ3());
		if (questionsetDto.getQ4() != null)
			question.setQ4(questionsetDto.getQ4());
		
		return qsetDao.save(question);
	}
	
	public QuestionsetDao update (QuestionsetDto questionsetDto) {
		
		QuestionsetDao question = new QuestionsetDao();
		
		if ((Long) questionsetDto.getSetId() != null)
			question.setSetId(questionsetDto.getSetId());
		if (questionsetDto.getSetName() != null)
			question.setSetName(questionsetDto.getSetName());
		if (questionsetDto.getQ1() != null)
			question.setQ1(questionsetDto.getQ1());
		if (questionsetDto.getQ2() != null)
			question.setQ2(questionsetDto.getQ2());
		if (questionsetDto.getQ3() != null)
			question.setQ3(questionsetDto.getQ3());
		if (questionsetDto.getQ4() != null)
			question.setQ4(questionsetDto.getQ4());
		
		return qsetDao.save(question);
	}

}