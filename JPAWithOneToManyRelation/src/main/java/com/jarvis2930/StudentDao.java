package com.jarvis2930;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
@Component
public interface StudentDao extends JpaRepository<QuestionsModel, Long> {
	

	public QuestionsModel saveAndFlush(QuestionsModel questionsModel);

}
