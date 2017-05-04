package com.grocery.data.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ShoppingListService {
	
	@Autowired
	private ShoppingRepository shoppingListRepository; 
	
	
	public ShoppingListService() {
	}
	
	public List<ShoppingList> getAll() {
		
		List<ShoppingList> shoppingLists = new ArrayList<ShoppingList>(); 
		shoppingListRepository.findAll().forEach(shoppingLists::add);
		return shoppingLists; 
	}
	
	public void delete(ShoppingList shoppingList) {
		shoppingListRepository.delete(shoppingList);	
	}
	
	public void add(ShoppingList shoppingList) {
		shoppingListRepository.save(shoppingList);
	}
	
	public ShoppingList getById(String id) {
		return shoppingListRepository.findOne(id);
	}
}






