package com.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Follow {
	
	private int followId;	//��עID
	private String followedId;	//����עID
	private int followType;	//��ע����
	private Timestamp followTime;//��עʱ��
	private String followUserId;//��ע��ID
	
	public int getFollowId() {
		return followId;
	}
	public void setFollowId(int followId) {
		this.followId = followId;
	}
	public String getFollowedId() {
		return followedId;
	}
	public void setFollowedId(String followedId) {
		this.followedId = followedId;
	}
	public int getFollowType() {
		return followType;
	}
	public void setFollowType(int followType) {
		this.followType = followType;
	}
	public Timestamp getFollowTime() {
		return followTime;
	}
	public void setFollowTime(Timestamp followTime) {
		this.followTime = followTime;
	}
	public String getFollowUserId() {
		return followUserId;
	}
	public void setFollowUserId(String followUserId) {
		this.followUserId = followUserId;
	}
	
	
	
}
