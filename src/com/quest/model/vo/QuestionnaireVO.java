package com.quest.model.vo;

import java.util.HashSet;
import java.util.Set;

import com.quest.model.dto.Answer;
import com.quest.model.dto.Question;

public class QuestionnaireVO {
	
	private Question question = new Question();
	
	private Set<Answer> answers = new HashSet<Answer>(5);

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Set<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<Answer> answers) {
		this.answers = answers;
	}
	
	

}
