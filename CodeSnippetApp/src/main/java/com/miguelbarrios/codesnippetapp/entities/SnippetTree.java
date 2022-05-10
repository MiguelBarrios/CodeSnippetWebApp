package com.miguelbarrios.codesnippetapp.entities;

import org.springframework.data.annotation.Id;

public class SnippetTree {
	
	@Id
	private String treeId;
	
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

	@Override
	public String toString() {
		return "Tree [treeId=" + treeId + "]";
	}
}
