package com.doksusa.dao;

import java.util.List;

public interface UserDAO {
	
	public List<UserDAO> user_selectAll();
	
	public UserDAO user_select();
	
	public int user_insert();
	
	public int user_update();
	
	public int user_delete();
	
	

}
