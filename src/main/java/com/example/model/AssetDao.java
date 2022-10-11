package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset")
public class AssetDao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long assetId;
	@Column
	private String category;
	@Column
	private String itemGroup;
	@Column
	private String itemCode;
	@Column
	private String modelNo;
	@Column
	private String manufacturer;
	@Column
	private String price;
	@Column
	private String expiryDate;
	@Column
	private String warrantyTill;
	@Column
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