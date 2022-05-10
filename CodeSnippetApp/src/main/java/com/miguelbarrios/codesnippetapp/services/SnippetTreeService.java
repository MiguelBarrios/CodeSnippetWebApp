package com.miguelbarrios.codesnippetapp.services;

import com.miguelbarrios.codesnippetapp.entities.Directory;
import com.miguelbarrios.codesnippetapp.entities.User;

public interface SnippetTreeService {

	Directory getTreeByName(String treename, User user);

	Directory updateTree(Directory root, User user);
}
