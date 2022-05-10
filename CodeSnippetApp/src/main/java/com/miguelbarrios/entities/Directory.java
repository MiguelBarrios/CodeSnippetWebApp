package com.miguelbarrios.entities;

import java.util.Arrays;
import java.util.List;

public class Directory {
	private String name;
	private Directory[] directories;
	private File[] files;
	
	public Directory() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Directory[] getDirectories() {
		return directories;
	}

	public void setDirectories(Directory[] directories) {
		this.directories = directories;
	}

	public File[] getFiles() {
		return files;
	}

	public void setFiles(File[] files) {
		this.files = files;
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + ", directories=" + Arrays.toString(directories) + ", files=" + Arrays.toString(files) + "]";
	}
	
	
}
