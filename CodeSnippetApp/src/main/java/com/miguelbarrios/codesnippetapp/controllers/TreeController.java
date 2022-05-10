package com.miguelbarrios.codesnippetapp.controllers;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelbarrios.codesnippetapp.entities.Directory;
import com.miguelbarrios.codesnippetapp.entities.User;
import com.miguelbarrios.codesnippetapp.services.SnippetTreeService;

@RestController
@RequestMapping("api")
public class TreeController {
	
	@Autowired
	SnippetTreeService treeService;
	
	@PostMapping("trees")
	public Directory addTree(@RequestBody Directory dir) {
		User user = new User();
		user.setUsername("locnessbarrios");
		Directory res = treeService.addTree(dir, user);
		return res;
	}
	
	@GetMapping("trees/{treename}")
	public Directory getTree(@PathVariable String treename, HttpServletResponse res, HttpSession session) {
		
		User sessionUser = (User) session.getAttribute("user");
		System.out.println("Session User: " + sessionUser);
		
		User user = new User();
		user.setUsername("locnessbarrios");
		Directory root = treeService.getTreeByName(treename, user);
		
		if(root == null) {
			res.setStatus(404);
		}
		
		return root;
	}
	
	@PutMapping("trees")
	public Directory updateTree(@RequestBody Directory dir) {
		User user = new User();
		user.setUsername("locnessbarrios");
		Directory root = treeService.updateTree(dir, user);
		return root;

	}
}
