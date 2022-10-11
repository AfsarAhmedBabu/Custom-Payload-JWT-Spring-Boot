package com.example.model;

public class AnnouncementDto {
	
	private long announcementId;
	private String announcementType;
	private String announcementName;
	private String announcementDate;
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