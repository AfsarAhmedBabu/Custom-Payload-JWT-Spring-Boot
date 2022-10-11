package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transition")
public class EmpTransitionDao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long transitionId;
	@Column
	private String transitionName;
	
	public long getTransitionId() {
		return transitionId;
	}
	
	public void setTransitionId(long transitionId) {
		this.transitionId = transitionId;
	}
	
	public String getTransitionName() {
		return transitionName;
	}
	
	public void setTransitionName(String transitionName) {
		this.transitionName = transitionName;
	}
	
}
