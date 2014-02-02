 	package com.quest.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.quest.business.UserService;
import com.quest.model.dto.Answer;
import com.quest.model.vo.QuestionnaireVO;

@Controller
public class QuestController {

	@Autowired
	private UserService userService;

	@RequestMapping("/newQuestionnaire")
	public String listContacts(Map<String, Object> map) {

		map.put("questionnaire", new QuestionnaireVO());
		
		return "newQuestionnaire";
	}
	
	@RequestMapping("/saveQuestionnaire")
	public String save(Map<String, Object> map) {

		map.put("questionnaire", new QuestionnaireVO());
		
		return "newQuestionnaire";
	}
	
	@RequestMapping("/myclassroom")
	public String goToStuDBoardmyClassRoom() {

			
		return "student";
	}
	
	@RequestMapping(value = "/saveAnswers", method = RequestMethod.POST, headers = "Accept=application/json")
	public ResponseEntity<String> createFromJsonArray(@RequestBody String json) {
	    String s = Answer.fromJsonArrayToAnswer(json);
	    HttpHeaders headers = new HttpHeaders();
	    headers.add("Content-Type", "application/json");
	    return new ResponseEntity<String>(s,headers, HttpStatus.CREATED);
	}

}
