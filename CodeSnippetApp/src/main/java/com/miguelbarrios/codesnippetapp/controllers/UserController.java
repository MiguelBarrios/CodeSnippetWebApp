package com.miguelbarrios.codesnippetapp.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.miguelbarrios.codesnippetapp.entities.User;
import com.miguelbarrios.codesnippetapp.repositories.UserRepository;
import com.miguelbarrios.codesnippetapp.services.SnippetTreeService;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	private SnippetTreeService treeService;
	
	@GetMapping(path= {"/", "home.do"})
	public String home() {
		System.out.println("TEST TEst");
		return "WEB-INF/home.jsp";
	}
	
	@RequestMapping(path = "/login.do", method = RequestMethod.POST)
	public String login(User user, HttpSession session) {
		System.out.println("***");
		System.out.println(user);
		session.setAttribute("user", user);
		return "WEB-INF/accountHome.jsp";
	}
	
	
	
}
