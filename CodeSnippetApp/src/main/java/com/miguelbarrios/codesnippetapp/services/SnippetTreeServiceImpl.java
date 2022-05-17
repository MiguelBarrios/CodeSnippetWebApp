package com.miguelbarrios.codesnippetapp.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguelbarrios.codesnippetapp.entities.Directory;
import com.miguelbarrios.codesnippetapp.entities.SnippetTree;
import com.miguelbarrios.codesnippetapp.entities.User;
import com.miguelbarrios.codesnippetapp.repositories.SnippetTreeRepository;

@Service
public class SnippetTreeServiceImpl implements SnippetTreeService {
	
	@Autowired
	private SnippetTreeRepository treeRepo;
	
	@Override
	public Directory addTree(Directory root, User user) {
		String treeid = user.getUsername() + ":" + root.getName();
		SnippetTree tree = new SnippetTree();
		tree.setTreeId(treeid);
		tree.setRoot(root);
		tree.setUsername(user.getUsername());
		tree = treeRepo.save(tree);
		return tree.getRoot();
	}
	
	@Override
	public Directory getTreeByName(String treename, User user) {
		String treeid = user.getUsername() + ":" + treename;
		Optional<SnippetTree> option = treeRepo.findById(treeid);
		return option.isPresent() ? option.get().getRoot() : null;
	}
	
	//TODO: Test
	@Override
	public Directory updateTree(Directory root, User user) {
		String treeid = user.getUsername() + ":" + root.getName();
		Optional<SnippetTree> option = treeRepo.findById(treeid);
		
		SnippetTree tree = option.isPresent() ? option.get() : null;
		tree.setRoot(root);
		treeRepo.save(tree);
		return tree.getRoot();
	}
	
	public boolean deleteTree(User user, String treename) {
		String treeid = user.getUsername() + ":" + treename;
		return false;
	}
	
	@Override
	public Map<String, Directory> getUserTrees(User user){
		List<SnippetTree> trees = treeRepo.findByUsername(user.getUsername());
		Map<String, Directory> map = new HashMap<>();
		for(SnippetTree tree : trees) {
			map.put(tree.getRoot().getName(), tree.getRoot());
		}
		return map;
	}
}
