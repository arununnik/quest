package com.quest.business;

import java.util.List;

import com.quest.model.dto.User;


public interface UserService {
	
	public void addUser(User contact);
	public List<User> listUser();
	public void removeUser(Integer id);
}
