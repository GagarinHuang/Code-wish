package com.model;

import java.sql.Timestamp;

public class Answer {
	
	private int answerId;	//�ش�ID
	private int answerApprovalNum;	//�ش������
	private String answerContent;	//�ش�����
	private Timestamp answerTime;		//�ش�ʱ��
	private String answerUserId;		//�ش���ID
	
	//
	private int questionId;		//��������ID
	private String questionUserId;//��������������ID
	private String questionTitle;//�����������
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	public String getQuestionUserId() {
		return questionUserId;
	}
	public void setQuestionUserId(String questionUserId) {
		this.questionUserId = questionUserId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public int getAnswerApprovalNum() {
		return answerApprovalNum;
	}
	public void setAnswerApprovalNum(int answerApprovalNum) {
		this.answerApprovalNum = answerApprovalNum;
	}
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public Timestamp getAnswerTime() {
		return answerTime;
	}
	public void setAnswerTime(Timestamp answerTime) {
		this.answerTime = answerTime;
	}
	public String getAnswerUserId() {
		return answerUserId;
	}
	public void setAnswerUserId(String answerUserId) {
		this.answerUserId = answerUserId;
	}
	
	
}
