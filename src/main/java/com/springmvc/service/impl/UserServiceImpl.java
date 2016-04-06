package com.springmvc.service.impl;

import java.sql.Types;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import com.springmvc.entity.User;
import com.springmvc.service.UserService;

public class UserServiceImpl extends JdbcDaoSupport implements UserService {

	public int register(User user) {
		String sql = "INSERT INTO user (username,pwd) VALUES(?,?)";
		Object args[] = new Object[2];
		args[0] = user.getUsername();
		args[1] = user.getPwd();
		
		int argTypes[] = new int[2];
		argTypes[0] = Types.VARCHAR;
		argTypes[1] = Types.VARCHAR;
		
		return this.getJdbcTemplate().update(sql, args, argTypes);
	}

	public int login(User user) {
		String sql = "SELECT count(1) FROM user WHERE username = ? AND pwd = ?";
		Object args[] = new Object[2];
		args[0] = user.getUsername();
		args[1] = user.getPwd();
		
		int argTypes[] = new int[2];
		argTypes[0] = Types.VARCHAR;
		argTypes[1] = Types.VARCHAR;
		return this.getJdbcTemplate().queryForInt(sql, args, argTypes);
	}

}
