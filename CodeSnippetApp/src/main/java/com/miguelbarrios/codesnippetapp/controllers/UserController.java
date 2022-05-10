package com.miguelbarrios.codesnippetapp.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.miguelbarrios.codesnippetapp.entities.User;
import com.miguelbarrios.codesnippetapp.repositories.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@GetMapping(path= {"/", "home.do"})
	public String home() {
		System.out.println("TEST TEst");
		return "home";
	}
	
	@PostMapping("login.do")
	public String login(User user, HttpSession session) {
		session.setAttribute("user", user);
		System.out.println("*** made it to login controller");
		System.out.println(user);
		return "accountHome";
	}
	
	
	
}
