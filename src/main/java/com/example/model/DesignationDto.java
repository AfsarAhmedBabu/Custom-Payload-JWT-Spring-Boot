package com.example.model;


public class DesignationDto {	
	private long seqId;
	private String designationId;
	private String designationName;
	private String description;
	
	
	public DesignationDto() {
		super();
	}
	public DesignationDto(long seqId, String designationId,
			String designationName, String description) {
		super();
		this.seqId = seqId;
		this.designationId = designationId;
		this.designationName = designationName;
		this.description = description;
	}
	public long getSeqId() {
		return seqId;
	}
	public void setSeqId(long seqId) {
		this.seqId = seqId;
	}
	public String getDesignationId() {
		return designationId;
	}
	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
