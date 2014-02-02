 package com.quest.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quest.business.UserService;
import com.quest.model.dao.UserDAO;
import com.quest.model.dto.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Transactional
	public void addUser(User user) {
		userDAO.saveUser(user);
	}

	@Transactional
	public List<User> listUser() {

		return userDAO.listUser();
	}

	@Transactional
	public void removeUser(Integer id) {
		//userDAO.removeUser(id);
	}
}
