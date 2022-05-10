package com.miguelbarrios.entities;

public class File {
	private String name;
	
	private String content;
	
	public File() {}

	@Override
	public String toString() {
		return "File [name=" + name + ", content=" + content + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
