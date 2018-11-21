package com.jarvis2930;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class QuestionsModel 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "qId")
	private int qId;
	@Column(name="question")
	private String question;
	
	@OneToMany(mappedBy="questionsModel",cascade=CascadeType.ALL)
	List<AnswerModel> answerModels;
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<AnswerModel> getAnswerModels() {
		return answerModels;
	}
	public void setAnswerModels(List<AnswerModel> answerModels) {
		this.answerModels = answerModels;
	}

}
