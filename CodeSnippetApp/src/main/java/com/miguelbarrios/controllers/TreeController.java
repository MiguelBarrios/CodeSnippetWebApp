package com.miguelbarrios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miguelbarrios.entities.GroceryItem;
import com.miguelbarrios.entities.ItemRepository;

@RestController
@RequestMapping("api")
public class TreeController {
	
	@Autowired
	ItemRepository groceryItemRepo;
	
	@GetMapping("trees")
	private GroceryItem getTrees() {
		String name = "Dried Whole Red Chilli";
		GroceryItem item = groceryItemRepo.findItemByName(name);
		return item;
	}
}
