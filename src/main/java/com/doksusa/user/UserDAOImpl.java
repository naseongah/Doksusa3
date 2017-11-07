package com.doksusa.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public class UserDAOImpl implements UserDAO {

	@Autowired
	SqlSession session;

	String namespace = "com.doksusa.user.";

	@Override
	public List<UserDAO> user_selectAll() {
		return session.selectList(namespace + "user_selectAll");
	}

	@Override
	public UserDAO user_select(String u_id) {
		return session.selectOne(namespace + "user_selectById", u_id);
	}

	@Override
	public int user_insert(UserDAO userdao) {
		return session.insert(namespace + "user_insert", userdao);
	}

	@Override
	public int user_update(String u_pw) {
		return session.insert(namespace + "user_update", u_pw);
	}

	@Override
	public int user_delete(String u_id) {
		return session.insert(namespace + "user_delete", u_id);
	}

	@Override
	public UserDAO login(String u_id, String u_pw) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("u_id", u_id);
		data.put("u_pw", u_pw);
		return session.selectOne(namespace + "user_login", data);
	}

}
