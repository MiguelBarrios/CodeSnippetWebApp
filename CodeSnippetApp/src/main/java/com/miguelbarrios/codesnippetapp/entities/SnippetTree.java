package com.miguelbarrios.codesnippetapp.entities;

import org.springframework.data.annotation.Id;

public class SnippetTree {
	
	@Id
	private String treeId;
	
	private String username;
	
	private Directory root;
	
	public SnippetTree() {}

	public String getTreeId() {
		return treeId;
	}

	public void setTreeId(String treeId) {
		this.treeId = treeId;
	}

	public Directory getRoot() {
		return root;
	}

	public void setRoot(Directory root) {
		this.root = root;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "SnippetTree [treeId=" + treeId + ", username=" + username + "]";
	}


}
