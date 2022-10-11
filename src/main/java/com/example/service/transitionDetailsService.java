package com.example.service;

import java.util.ArrayList;
import java.util.List;

import com.example.model.EmpTransitionDao;
import com.example.model.EmpTransitionDto;
import com.example.repository.TransitionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class transitionDetailsService {
	
	@Autowired
	private TransitionRepository transitionDao;
	
	public List<EmpTransitionDto> findAll() {
		
		List<EmpTransitionDto> allTransitions = new ArrayList<>();
		
		for (EmpTransitionDao empTransitionDao : transitionDao.findAll()) {
			EmpTransitionDto trans = new EmpTransitionDto();
			
			if ((Long) empTransitionDao.getTransitionId() != null)
				trans.setTransitionId(empTransitionDao.getTransitionId());
			if (empTransitionDao.getTransitionName() != null)
				trans.setTransitionName(empTransitionDao.getTransitionName());
			
			allTransitions.add(trans);
			
		}
		
		return allTransitions;
	}
	
	public EmpTransitionDao save(EmpTransitionDto transition) {
		EmpTransitionDao newEmpTran = new EmpTransitionDao();
		if ((Long) transition.getTransitionId() != null)
			newEmpTran.setTransitionId(transition.getTransitionId());
		newEmpTran.setTransitionName(transition.getTransitionName());
		return transitionDao.save(newEmpTran);
	}
	
	public String update(EmpTransitionDto transition) {
		EmpTransitionDao newEmpTran = new EmpTransitionDao();
		newEmpTran.setTransitionId(transition.getTransitionId());
		newEmpTran.setTransitionName(transition.getTransitionName());
		transitionDao.save(newEmpTran);
		return "Employee Transition Successfully Updated.";
	}
	
	public String delete(EmpTransitionDto transition) {
		EmpTransitionDao newEmpTran = new EmpTransitionDao();
		newEmpTran.setTransitionId(transition.getTransitionId());
		transitionDao.delete(newEmpTran);
		return "Employee Transition Successfully Deleted.";
	}

}