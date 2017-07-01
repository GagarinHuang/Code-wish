package com.model;

import java.sql.Date;
import java.sql.Timestamp;



public class Question {
	private int followNumber;//��ע��
	private Date questionCreateTime;	//����ʱ��
	private String userId;					//������ID
	private int questionId;				//����ID
	private String quesTitle;			//�������
	private int answerCount;			//����ش���
	private String quesContent;			//��������
	
	//
	private Timestamp lastAnswerTime;		//���ظ�ʱ��
	private int topicId;				//��������ID
	
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public Timestamp getLastAnswerTime() {
		return lastAnswerTime;
	}
	public void setLastAnswerTime(Timestamp lastAnswerTime) {
		this.lastAnswerTime = lastAnswerTime;
	}
	public int getFollowNumber() {
		return followNumber;
	}
	public void setFollowNumber(int followNumber) {
		this.followNumber = followNumber;
	}
	public Date getQuestionCreateTime() {
		return questionCreateTime;
	}
	public void setQuestionCreateTime(Date questionCreateTime) {
		this.questionCreateTime = questionCreateTime;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuesTitle() {
		return quesTitle;
	}
	public void setQuesTitle(String quesTitle) {
		this.quesTitle = quesTitle;
	}
	public int getAnswerCount() {
		return answerCount;
	}
	public void setAnswerCount(int answerCount) {
		this.answerCount = answerCount;
	}
	public String getQuesContent() {
		return quesContent;
	}
	public void setQuesContent(String quesContent) {
		this.quesContent = quesContent;
	}
	
	
	
}
