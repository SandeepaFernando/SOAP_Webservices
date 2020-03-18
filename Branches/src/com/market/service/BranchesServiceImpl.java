package com.market.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.market.model.Branches;

public class BranchesServiceImpl implements BranchService {
	
	private static Map<Integer,Branches> branches = new HashMap<Integer,Branches>();

	@Override
	public boolean addBranch(Branches b) {
		// TODO Auto-generated method stub
		if(branches.get(b.getBrancheId()) != null) return false;
		branches.put(b.getBrancheId(), b);
		return true;
	}

	@Override
	public boolean deleteBranch(int id) {
		// TODO Auto-generated method stub
		if(branches.get(id) == null) return false;
		branches.remove(id);
		return true;
	}

	@Override
	public Branches getBranch(int id) {
		// TODO Auto-generated method stub
		return branches.get(id);
	}

	@Override
	public Branches[] getAllBranches() {
		// TODO Auto-generated method stub
		Set<Integer> ids = branches.keySet();
		Branches[] b = new Branches[ids.size()];
		int i=0;
		for(Integer id : ids){
			b[i] = branches.get(id);
			i++;
		}
		return b;
	}

}
