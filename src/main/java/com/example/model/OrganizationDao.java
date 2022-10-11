package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "organization")
public class OrganizationDao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long orgId;
	@Column
	private String orgName;
	@Column
	private String orgAddress;
	@Column
	private String orgPhone;
	@Column
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