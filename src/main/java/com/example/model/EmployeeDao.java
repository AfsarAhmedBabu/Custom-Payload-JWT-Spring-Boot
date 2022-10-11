package com.example.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeDao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	@Column
	private String firstname;
	@Column
	private String middlename;
	@Column
	private String lastname;
	@Column
	private String email;
	@Column
	private String empType;
	@Column
	private String empStatus;
	@Column
	private String endDate;
	@Column
	private String hireDate;
	@Column
	private String source;
	@Column
	private String workPhone;
	@Column
	private String shift;
	@Column
	private String bloodGroup;
	@Column
	private String spouseName;
	@Column
	private String fatherName;
	@Column
	private String motherName;
	@Column
	private String mobile;
	@Column
	private String otherEmail;
	@Column
	private String dateOfBirth;
	@Column
	private String nationality;
	@Column
	private String gender;
	@Column
	private String maritalStatus;
	@Column
	private String drivingLicense;
	@Column
	private String website;
	@Column
	private String address1;
	@Column
	private String address2;
	@Column
	private String city;
	@Column
	private String country;
	@Column
	private String state;
	@Column
	private String zipCode;
	@Column
	private String designation;
	@Column
	private String bio;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="dept_id",foreignKey=@ForeignKey(name="dept_id_fk"))
	private DepartmentDao dept;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="transition_id",foreignKey=@ForeignKey(name="transition_id_fk"))
	private EmpTransitionDao transition;
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getEmpStatus() {
		return empStatus;
	}
	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getWorkPhone() {
		return workPhone;
	}
	public void setWorkPhone(String workPhone) {
		this.workPhone = workPhone;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getOtherEmail() {
		return otherEmail;
	}
	public void setOtherEmail(String otherEmail) {
		this.otherEmail = otherEmail;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getDrivingLicense() {
		return drivingLicense;
	}
	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public DepartmentDao getDept() {
		return dept;
	}
	public void setDept(DepartmentDao dept) {
		this.dept = dept;
	}
	public EmpTransitionDao getTransition() {
		return transition;
	}
	public void setTransition(EmpTransitionDao transition) {
		this.transition = transition;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
}
