package com.jarvis2930;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {

	@Autowired
	StudentDao studentDao;
	public static void main(String[] args) 
	{
        SpringApplication.run(Application.class, args);
        
	}
	
	@PostConstruct
	public void init(){
		System.out.println("MyService init method called");
		
		QuestionsModel questionsModel = new QuestionsModel();
		questionsModel.setQuestion("what is your name");
		
		
		AnswerModel answerModel = new AnswerModel();
		answerModel.setAnswer("mahesh");
		answerModel.setQuestionsModel(questionsModel);
		AnswerModel answerModel2 = new AnswerModel();
		answerModel2.setAnswer("mahi");
		answerModel2.setQuestionsModel(questionsModel);

		
	    List<AnswerModel> answerList = new ArrayList<>();
	    answerList.add(answerModel);
	    answerList.add(answerModel2);
	    questionsModel.setAnswerModels(answerList);   

		studentDao.saveAndFlush(questionsModel);
		studentDao.flush();
	}
	
	
	
	

}
