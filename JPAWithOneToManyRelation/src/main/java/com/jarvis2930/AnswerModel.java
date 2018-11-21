package com.jarvis2930;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class AnswerModel 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name = "aId")
	private int aId;
	@Column (name = "answer")
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "qId")
	QuestionsModel questionsModel;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public QuestionsModel getQuestionsModel() {
		return questionsModel;
	}

	public void setQuestionsModel(QuestionsModel questionsModel) {
		this.questionsModel = questionsModel;
	}
	
	
	
}
