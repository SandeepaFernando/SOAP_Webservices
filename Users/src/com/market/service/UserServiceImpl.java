package com.market.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.market.model.User;

public class UserServiceImpl implements UserService{
	
	private static Map<Integer,User> user = new HashMap<Integer,User>();

	@Override
	public boolean addUser(User u) {
		// TODO Auto-generated method stub
		if(user.get(u.getId()) != null) return false;
		user.put(u.getId(), u);
		return true;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		if(user.get(id) == null) return false;
		user.remove(id);
		return true;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return user.get(id);
	}

	@Override
	public User[] getAllUsers() {
		// TODO Auto-generated method stub
		Set<Integer> ids = user.keySet();
		User[] p = new User[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = user.get(id);
			i++;
		}
		return p;
	}
}
