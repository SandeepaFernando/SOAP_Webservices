package com.market.service;

import com.market.model.Branches;

public interface BranchService {

	public boolean addBranch(Branches b);
	
	public boolean deleteBranch(int id);
	
	public Branches getBranch(int id);
	
	public Branches[] getAllBranches();
}
