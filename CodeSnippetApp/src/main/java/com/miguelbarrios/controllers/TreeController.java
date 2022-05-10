package com.miguelbarrios.controllers;

import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.miguelbarrios.data.User;
import com.miguelbarrios.entities.Directory;
import com.miguelbarrios.entities.SnippetTree;
import com.miguelbarrios.repositories.SnippetTreeRepository;

@RestController
@RequestMapping("api")
public class TreeController {
	
	@Autowired
	SnippetTreeRepository treeRepo;
	
	@GetMapping("trees/{treename}")
	public Directory getTree(@PathVariable String treename, HttpServletResponse res) {
		User user = new User();
		user.setUsername("locnessbarrios");
		String treeid = user.getUsername() + ":" + treename;
		Optional<SnippetTree> option = treeRepo.findById(treeid);
		
		if(option.isPresent()) {
			return option.get().getRoot();
		}else {
			res.setStatus(404);
			return null;
		}
	}
	
	@PostMapping("trees")
	public Directory addTree(@RequestBody Directory dir) {
		User user = new User();
		user.setUsername("locnessbarrios");
		
		SnippetTree tree = new SnippetTree();
		String treeId = user.getUsername()  + ":" + dir.getName();
		tree.setRoot(dir);
		tree.setTreeId(treeId);
		treeRepo.save(tree);
		return tree.getRoot();

	}
}
