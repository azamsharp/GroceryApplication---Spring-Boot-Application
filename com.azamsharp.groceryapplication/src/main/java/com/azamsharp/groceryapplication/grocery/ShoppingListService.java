package com.azamsharp.groceryapplication.grocery;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service 
public class ShoppingListService {
	
	private List<ShoppingList> shoppingLists = new ArrayList<ShoppingList>(); 
	
	public ShoppingListService() {
		this.shoppingLists.add(new ShoppingList("Fiesta"));
		this.shoppingLists.add(new ShoppingList("HEB"));
		this.shoppingLists.add(new ShoppingList("Whole Foods")); 
	}
	
	public List<ShoppingList> getAll() {
		return this.shoppingLists; 
	}
	
	public void delete(ShoppingList shoppingList) {
		this.shoppingLists.remove(shoppingList); 
	}
	
	public void add(ShoppingList shoppingList) {
		this.shoppingLists.add(shoppingList); 
	}
	
	public ShoppingList getBy(String title) {
		return this.shoppingLists.stream().filter(x -> x.getTitle().toLowerCase().equals(title.toLowerCase())).findFirst().get(); 
	}
}






