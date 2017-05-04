package com.grocery.data.classes;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingListController {

	@Autowired
	private ShoppingListService service; 
	
	@RequestMapping("/shoppinglists")
	public List<ShoppingList> getAll() {
		return service.getAll();
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/shoppinglists/{id}")
	public void delete(@PathVariable String id) {
		
		ShoppingList shoppingList = service.getById(id); 
		service.delete(shoppingList);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/shoppinglists")
	public void add(@RequestBody ShoppingList shoppingList) {
		service.add(shoppingList);
	}
	
	@RequestMapping("/shoppinglists/{id}")
	public ShoppingList getById(@PathVariable String id) {
		ShoppingList shoppingList = service.getById(id);
		return shoppingList; 
	}
	
}




