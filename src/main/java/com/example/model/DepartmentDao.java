package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "department")
public class DepartmentDao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long deptId;
	@Column
	private String deptName;
	@Column
	private String deptHead;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="org_id",foreignKey=@ForeignKey(name="org_id_fk"))
	private OrganizationDao deptParent;
	
	
	public long getDeptId() {
		return deptId;
	}
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptHead() {
		return deptHead;
	}
	public void setDeptHead(String deptHead) {
		this.deptHead = deptHead;
	}
	public OrganizationDao getDeptParent() {
		return deptParent;
	}
	public void setDeptParent(OrganizationDao deptParent) {
		this.deptParent = deptParent;
	}
	

}