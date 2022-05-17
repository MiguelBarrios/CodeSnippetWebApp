package com.miguelbarrios.codesnippetapp.entities;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("users")
public class User {

	@Id
	private String username;
	
	private String password;
	
	private String email;
	
	private Set<String> trees;

	public User() {}
	
	public User(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Set<String> getTrees() {
		return trees;
	}

	public void setTrees(Set<String> trees) {
		this.trees = trees;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", trees=" + trees + "]";
	}
	
	
	
	
	
	
}
