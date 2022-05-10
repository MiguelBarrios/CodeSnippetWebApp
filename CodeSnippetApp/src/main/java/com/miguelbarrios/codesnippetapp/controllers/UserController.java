package com.miguelbarrios.codesnippetapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.miguelbarrios.codesnippetapp.repositories.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping("/")
	public String home() {
		System.out.println("TEST TEst");
		return "home";
	}
	
}
