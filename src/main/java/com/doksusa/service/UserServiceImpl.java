package com.doksusa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.doksusa.dao.UserDAO;

@Service("userService")
public class UserServiceImpl implements UserService{

	
	@Autowired
	@Qualifier("user")
	UserDAO user;
	
	@Override
	public List<UserDAO> user_selectAll() {
		return user.user_selectAll();
	}

	@Override
	public UserDAO user_select(String u_id) {
		return user.user_select(u_id);
	}

	@Override
	public int user_insert(UserDAO userdao) {
		return user.user_insert(userdao);
	}

	@Override
	public int user_update(UserDAO userdao) {
		return user.user_update(userdao);
	}

	@Override
	public int user_delete(String u_id) {
		return user.user_delete(u_id);
	}

	@Override
	public UserDAO login(String u_id, String u_pw) {
		return user.login(u_id, u_pw);
	}

}
