 	package com.quest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.quest.business.UserService;

@Controller
public class AppController {

	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String goHome() {
		return "home";
	}
	

 }
