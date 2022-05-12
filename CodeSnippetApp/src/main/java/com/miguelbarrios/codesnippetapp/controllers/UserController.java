package com.miguelbarrios.codesnippetapp.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

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
		return "home";
	}
	
	@PostMapping("login.do")
	public ModelAndView login(User user, HttpSession session) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("username", user.getUsername());
		session.setAttribute("user", user);
		mv.setViewName("accountHome");
		return mv;
	}
	
	
	
}
