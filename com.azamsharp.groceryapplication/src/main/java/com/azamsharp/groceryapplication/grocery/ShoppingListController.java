package com.azamsharp.groceryapplication.grocery;

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
	
	@RequestMapping(method=RequestMethod.DELETE, value="/shoppinglists/{title}")
	public void delete(@PathVariable String title) {
		
		ShoppingList shoppingList = service.getBy(title); 
		service.delete(shoppingList);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/shoppinglists")
	public void add(@RequestBody ShoppingList shoppingList) {
		service.add(shoppingList);
	}
	
	@RequestMapping("/shoppinglists/{title}")
	public ShoppingList getByTitle(@PathVariable String title) {
		ShoppingList shoppingList = service.getBy(title);
		return shoppingList; 
	}
	
}




