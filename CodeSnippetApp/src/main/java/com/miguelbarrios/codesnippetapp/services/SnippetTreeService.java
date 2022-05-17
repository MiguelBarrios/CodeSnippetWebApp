package com.miguelbarrios.codesnippetapp.services;

import java.util.Map;

import com.miguelbarrios.codesnippetapp.entities.Directory;
import com.miguelbarrios.codesnippetapp.entities.User;

public interface SnippetTreeService {

	Directory getTreeByName(String treename, User user);

	Directory updateTree(Directory root, User user);

	Directory addTree(Directory root, User user);

	Map<String, Directory> getUserTrees(User user);
}
