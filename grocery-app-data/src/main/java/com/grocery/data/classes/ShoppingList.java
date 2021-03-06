package com.grocery.data.classes;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class ShoppingList {
	
	@Id 
	private String id; 
	private String title;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}	

	public ShoppingList() {
		
	}
	
	public ShoppingList(String title) {
		this.title = title; 
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	} 
	
	
}
