package com.model;

import java.sql.Date;

public class Report {

	private int reportedId;//���ٱ���ID
	private int reportId;	//�ٱ�ID
	private int reportType; //�ٱ�����
	private String reportReason;	//�ٱ�����
	private Date reportTime;		//�ٱ�ʱ��
	private int reporterId;			//�ٱ���ID
	
	public int getReportedId() {
		return reportedId;
	}
	public void setReportedId(int reportedId) {
		this.reportedId = reportedId;
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getReportType() {
		return reportType;
	}
	public void setReportType(int reportType) {
		this.reportType = reportType;
	}
	public String getReportReason() {
		return reportReason;
	}
	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
	}
	public Date getReportTime() {
		return reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}
	public int getReporterId() {
		return reporterId;
	}
	public void setReporterId(int reporterId) {
		this.reporterId = reporterId;
	}
	
	
}
