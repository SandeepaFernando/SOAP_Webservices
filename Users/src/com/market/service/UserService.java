package com.market.service;

import com.market.model.User;

public interface UserService {
	public boolean addUser(User u);
	
	public boolean deleteUser(int id);
	
	public User getUser(int id);
	
	public User[] getAllUsers();
}
