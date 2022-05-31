package com.godLife.io.service.domain;

import java.sql.Date;


public class MyBadge {
	//F
	private int myBadgeNo;
	private String userEmail;
	private String badgeNo;
	private int actCount;
	
	//C
	public MyBadge(){
	}
	public int getMyBadgeNo() {
		return myBadgeNo;
	}
	public void setMyBadgeNo(int myBadgeNo) {
		this.myBadgeNo = myBadgeNo;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getBadgeNo() {
		return badgeNo;
	}
	public void setBadgeNo(String badgeNo) {
		this.badgeNo = badgeNo;
	}
	public int getActCount() {
		return actCount;
	}
	public void setActCount(int actCount) {
		this.actCount = actCount;
	}
	
	//ToString
	@Override
	public String toString() {
		return "MyBadge [myBadgeNo=" + myBadgeNo + ", userEmail=" + userEmail + ", badgeNo=" + badgeNo + ", actCount="
				+ actCount + "]";
	}
	
	

}




