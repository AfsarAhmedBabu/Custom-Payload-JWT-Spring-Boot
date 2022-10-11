package com.example.model;

public class DepartmentDto {
	
	private long deptId;
	private String deptName;
	private String deptHead;
	private long deptParent;
	
	
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
	public long getDeptParent() {
		return deptParent;
	}
	public void setDeptParent(long deptParent) {
		this.deptParent = deptParent;
	}
	
	
}