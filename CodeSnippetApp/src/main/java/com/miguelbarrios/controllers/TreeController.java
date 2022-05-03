package com.miguelbarrios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelbarrios.data.GroceryItem;
import com.miguelbarrios.data.ItemRepository;
import com.miguelbarrios.data.TreeItem;
import com.miguelbarrios.data.TreeRepository;

@RestController
@RequestMapping("api")
public class TreeController {
	
	@Autowired
	ItemRepository groceryItemRepo;
	
	@Autowired
	TreeRepository snippetTreeRepo;
	
	@GetMapping("trees")
	private GroceryItem getTrees() {
		String name = "Dried Whole Red Chilli";
		GroceryItem item = groceryItemRepo.findItemByName(name);
		return item;
	}
	
	@PostMapping("createTree")
	private TreeItem createTree() {
		
		TreeItem item = snippetTreeRepo.save(new TreeItem("mbarrios:ALGORITHMS","public static void main String{...}"));
		return item;
	}
}
