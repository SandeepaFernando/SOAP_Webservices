package com.market.service;

import com.market.model.Grocery;

public interface GroceryService {

	public boolean addItem(Grocery g);
	
	public boolean deleteItem(int id);
	
	public Grocery getItem(int id);
	
	public Grocery[] getAllItems();
	
}
