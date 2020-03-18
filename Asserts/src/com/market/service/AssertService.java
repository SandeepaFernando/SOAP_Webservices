package com.market.service;

import com.market.model.Asserts;

public interface AssertService {
	
	public boolean addAssert(Asserts a);
	
	public boolean deleteAssert(int id);
	
	public Asserts getAssert(int id);
	
	public Asserts[] getAllAsserts();
}
