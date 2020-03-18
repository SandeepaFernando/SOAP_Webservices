package com.market.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.market.model.Asserts;

public class AssertServiceImpl implements AssertService {
	
	private static Map<Integer,Asserts> asserts = new HashMap<Integer,Asserts>();

	@Override
	public boolean addAssert(Asserts a) {
		// TODO Auto-generated method stub
		if(asserts.get(a.getAssertId()) != null) return false;
		asserts.put(a.getAssertId(), a);
		return true;
	}

	@Override
	public boolean deleteAssert(int id) {
		// TODO Auto-generated method stub
		if(asserts.get(id) == null) return false;
		asserts.remove(id);
		return true;
	}

	@Override
	public Asserts getAssert(int id) {
		// TODO Auto-generated method stub
		return asserts.get(id);
	}

	@Override
	public Asserts[] getAllAsserts() {
		// TODO Auto-generated method stub
		Set<Integer> ids = asserts.keySet();
		Asserts[] p = new Asserts[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = asserts.get(id);
			i++;
		}
		return p;
	}

}
