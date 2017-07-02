package com.model;

import java.sql.Date;
import java.sql.Timestamp;

public class Report {

	private String reportedId;//���ٱ���ID
	private int reportId;	//�ٱ�ID
	private int reportType; //�ٱ�����
	private String reportReason;	//�ٱ�����
	private Timestamp reportTime;		//�ٱ�ʱ��
	private String reporterId;			//�ٱ���ID
	
	public String getReportedId() {
		return reportedId;
	}
	public void setReportedId(String reportedId) {
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
	public Timestamp getReportTime() {
		return reportTime;
	}
	public void setReportTime(Timestamp reportTime) {
		this.reportTime = reportTime;
	}
	public String getReporterId() {
		return reporterId;
	}
	public void setReporterId(String reporterId) {
		this.reporterId = reporterId;
	}
	
	
}
