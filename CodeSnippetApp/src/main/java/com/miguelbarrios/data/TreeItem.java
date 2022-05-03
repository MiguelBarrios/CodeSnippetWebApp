package com.miguelbarrios.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("snippettrees")
public class TreeItem {
	
	@Id
	private String id;
	
	private String data;
	
	public TreeItem() {}

	public TreeItem(String id, String data) {
		super();
		this.id = id;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	

}
