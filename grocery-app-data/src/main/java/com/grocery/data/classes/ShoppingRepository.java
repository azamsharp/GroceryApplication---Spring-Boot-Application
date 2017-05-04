package com.grocery.data.classes;

import org.springframework.data.repository.CrudRepository;

public interface ShoppingRepository extends CrudRepository<ShoppingList,String> {

	
}
