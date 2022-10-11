package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "announcement")
public class AnnouncementDao {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long announcementId;
	@Column
	private String announcementType;
	@Column
	private String announcementName;
	@Column
	private String announcementDate;
	@Column
	private String announcementDesc;
	
	
	public long getAnnouncementId() {
		return announcementId;
	}
	public void setAnnouncementId(long announcementId) {
		this.announcementId = announcementId;
	}
	public String getAnnouncementType() {
		return announcementType;
	}
	public void setAnnouncementType(String announcementType) {
		this.announcementType = announcementType;
	}
	public String getAnnouncementName() {
		return announcementName;
	}
	public void setAnnouncementName(String announcementName) {
		this.announcementName = announcementName;
	}
	public String getAnnouncementDate() {
		return announcementDate;
	}
	public void setAnnouncementDate(String announcementDate) {
		this.announcementDate = announcementDate;
	}
	public String getAnnouncementDesc() {
		return announcementDesc;
	}
	public void setAnnouncementDesc(String announcementDesc) {
		this.announcementDesc = announcementDesc;
	}

}