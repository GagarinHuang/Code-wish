package com.model;

import java.sql.Date;

public class Follow {
	
	private int followId;	//��עID
	private int followedId;	//����עID
	private int followType;	//��ע����
	private Date followTime;//��עʱ��
	private int followUserId;//��ע��ID
	
	public int getFollowId() {
		return followId;
	}
	public void setFollowId(int followId) {
		this.followId = followId;
	}
	public int getFollowedId() {
		return followedId;
	}
	public void setFollowedId(int followedId) {
		this.followedId = followedId;
	}
	public int getFollowType() {
		return followType;
	}
	public void setFollowType(int followType) {
		this.followType = followType;
	}
	public Date getFollowTime() {
		return followTime;
	}
	public void setFollowTime(Date followTime) {
		this.followTime = followTime;
	}
	public int getFollowUserId() {
		return followUserId;
	}
	public void setFollowUserId(int followUserId) {
		this.followUserId = followUserId;
	}
	
	
	
}
