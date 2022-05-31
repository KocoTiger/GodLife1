package com.godLife.io.service.domain;

import java.sql.Date;


public class Badges {
	//F
	private int badgeNo;
	private String badgeName;
	private String badgeImg;
	private int actCount;
	private String grade;
	private String detail;
	private String status;
	
	//C
	public Badges(){
	}
	public int getBadgeNo() {
		return badgeNo;
	}
	public void setBadgeNo(int badgeNo) {
		this.badgeNo = badgeNo;
	}
	public String getBadgeName() {
		return badgeName;
	}
	public void setBadgeName(String badgeName) {
		this.badgeName = badgeName;
	}
	public String getBadgeImg() {
		return badgeImg;
	}
	public void setBadgeImg(String badgeImg) {
		this.badgeImg = badgeImg;
	}
	public int getActCount() {
		return actCount;
	}
	public void setActCount(int actCount) {
		this.actCount = actCount;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//Tostring
	@Override
	public String toString() {
		return "Badges [badgeNo=" + badgeNo + ", badgeName=" + badgeName + ", badgeImg=" + badgeImg + ", actCount="
				+ actCount + ", grade=" + grade + ", detail=" + detail + ", status=" + status + "]";
	}
	
	


}




