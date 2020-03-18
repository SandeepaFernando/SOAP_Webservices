package com.market.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.market.model.Grocery;

public class GroceryServiceImpl implements GroceryService {
	
	private static Map<Integer,Grocery> item = new HashMap<Integer,Grocery>();

	@Override
	public boolean addItem(Grocery g) {
		// TODO Auto-generated method stub
		if(item.get(g.getItemId()) != null) return false;
		item.put(g.getItemId(), g);
		return true;
	}

	@Override
	public boolean deleteItem(int id) {
		// TODO Auto-generated method stub
		if(item.get(id) == null) return false;
		item.remove(id);
		return true;
	}

	@Override
	public Grocery getItem(int id) {
		// TODO Auto-generated method stub
		return item.get(id);
	}

	@Override
	public Grocery[] getAllItems() {
		// TODO Auto-generated method stub
		Set<Integer> ids = item.keySet();
		Grocery[] g = new Grocery[ids.size()];
		int i=0;
		for(Integer id : ids){
			g[i] = item.get(id);
			i++;
		}
		return g;
	}

}
