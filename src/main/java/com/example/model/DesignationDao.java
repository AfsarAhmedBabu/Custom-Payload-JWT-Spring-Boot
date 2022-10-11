package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table( name = "designation",uniqueConstraints = { @UniqueConstraint( columnNames = { "seqId", "designation_id" } ) } )
public class DesignationDao {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="seqId", unique=true, length=20, updatable=false, nullable=false)
	private long seqId;
	@Column(name="designation_id", unique=true, length=40, nullable=false)
	private String designation_id;
	@Column(name="designation_name", length=255, nullable=false)
	private String designation_name;
	@Column(name="description", length=255)
	private String description;
		
	public DesignationDao() {
		super();
	}
	public DesignationDao(long seqId, String designation_id,
			String designation_name, String description) {
		super();
		this.seqId = seqId;
		this.designation_id = designation_id;
		this.designation_name = designation_name;
		this.description = description;
	}
	public long getId() {
		return seqId;
	}
	public void setId(long seqId) {
		this.seqId = seqId;
	}
	public String getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(String designation_id) {
		this.designation_id = designation_id;
	}
	public String getDesignation_name() {
		return designation_name;
	}
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "DesignationDao [seqId=" + seqId + ", designation_id="
				+ designation_id + ", designation_name=" + designation_name
				+ ", description=" + description + "]";
	}
	
}
