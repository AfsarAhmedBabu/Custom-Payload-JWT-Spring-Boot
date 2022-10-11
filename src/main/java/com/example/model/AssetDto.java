package com.example.model;

public class AssetDto {
	
	private long assetId;
	private String category;
	private String itemGroup;
	private String itemCode;
	private String modelNo;
	private String manufacturer;
	private String price;
	private String expiryDate;
	private String warrantyTill;
	private String isAllottable;
	
	
	
	public long getAssetId() {
		return assetId;
	}
	public void setAssetId(long assetId) {
		this.assetId = assetId;
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
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getWarrantyTill() {
		return warrantyTill;
	}
	public void setWarrantyTill(String warrantyTill) {
		this.warrantyTill = warrantyTill;
	}
	public String getIsAllottable() {
		return isAllottable;
	}
	public void setIsAllottable(String isAllottable) {
		this.isAllottable = isAllottable;
	}

}