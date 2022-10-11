package com.example.model;

public class AllotmentDto {
	
	private long allotmentId;
	private String category;
	private String itemGroup;
	private String itemCode;
	private long empId;
	private String givenDate;
	private String returnDate;
	private String isReturnable;
	
	
	public long getAllotmentId() {
		return allotmentId;
	}
	public void setAllotmentId(long allotmentId) {
		this.allotmentId = allotmentId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItemGroup() {
		return itemGroup;
	}
	public void setItemGroup(String itemGroup) {
		this.itemGroup = itemGroup;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getGivenDate() {
		return givenDate;
	}
	public void setGivenDate(String givenDate) {
		this.givenDate = givenDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getIsReturnable() {
		return isReturnable;
	}
	public void setIsReturnable(String isReturnable) {
		this.isReturnable = isReturnable;
	}

}