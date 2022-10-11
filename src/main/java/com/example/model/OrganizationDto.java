package com.example.model;

public class OrganizationDto {

	private long orgId;
	private String orgName;
	private String orgAddress;
	private String orgPhone;
	private String orgEmail;
		
	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}
	
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	public String getOrgAddress() {
		return orgAddress;
	}
	
	public void setOrgAddress(String orgAddress) {
		this.orgAddress = orgAddress;
	}
	
	public String getOrgPhone() {
		return orgPhone;
	}
	
	public void setOrgPhone(String orgPhone) {
		this.orgPhone = orgPhone;
	}
	
	public String getOrgEmail() {
		return orgEmail;
	}
	
	public void setOrgEmail(String orgEmail) {
		this.orgEmail = orgEmail;
	}

}