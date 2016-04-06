package com.springmvc.service;

import com.springmvc.entity.User;

public interface UserService {
	/**
	 * 用户注册
	 * @param u
	 */
	public int register(User u);
	
	/**
	 * 用户登录
	 * @param u
	 * @return 是否成功
	 */
	public int login(User u);
}
