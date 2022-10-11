package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "opening")
public class OpeningDao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long openingId;
	@Column
	private String positionTitle;
	@Column
	private String positionDesc;
	@Column
	private long deptId;
	@Column
	private String empType;
	@Column
	private String experience;
	@Column
	private String deadline;
	@Column
	private String location;
	@Column
	private String vacancies;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String country;
	@Column
	private String zipCode;
	@Column
	private String salary;
	@Column
	private String salaryType;
	@Column
	private String Questionset;
	
	
	public long getOpeningId() {
		return openingId;
	}
	public void setOpeningId(long openingId) {
		this.openingId = openingId;
	}
	public String getPositionTitle() {
		return positionTitle;
	}
	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}
	public String getPositionDesc() {
		return positionDesc;
	}
	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVacancies() {
		return vacancies;
	}
	public void setVacancies(String vacancies) {
		this.vacancies = vacancies;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}	
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getSalaryType() {
		return salaryType;
	}
	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}
	public String getQuestionset() {
		return Questionset;
	}
	public void setQuestionset(String questionset) {
		Questionset = questionset;
	}

}
