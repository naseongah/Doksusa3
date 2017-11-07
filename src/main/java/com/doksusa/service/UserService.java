package com.doksusa.service;

import java.util.List;

import com.doksusa.dao.UserDAO;

public interface UserService {

	public List<UserDAO> user_selectAll();

	public UserDAO user_select(String u_id);

	public int user_insert(UserDAO userdao);

	public int user_update(String u_pw);

	public int user_delete(String u_id);

	public UserDAO login(String u_id, String u_pw);

}
