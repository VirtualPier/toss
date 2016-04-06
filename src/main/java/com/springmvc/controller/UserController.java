package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userServer;
	
	/*@RequestMapping(value="/register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request, User u){
		System.out.println(u);
		System.out.println("username：" + u.getUsername() + " pwd："+ u.getPwd());
		return new ModelAndView("HelloWorld", "message", "Hello "+u.getUsername()+" your Pwd :"+u.getPwd()) ;
	}*/
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request, String username, String pwd){
		System.out.println("username：" + username+ " pwd："+ pwd);
		User u = new User();//不知道为什么，这里不能直接把表单得到的数据绑定到User对象中。
		u.setUsername(username);
		u.setPwd(pwd);
		if(userServer.register(u)!=0){
			return new ModelAndView("HelloWorld", "message", "Hello "+ username +" your Pwd :"+pwd) ;
		} else{
			return new ModelAndView("Error", "message", "Error") ;
		}
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,String username,String pwd){
		User u = new User();//不知道为什么，这里不能直接把表单得到的数据绑定到User对象中。
		u.setUsername(username);
		u.setPwd(pwd);
		if(userServer.login(u)!=0){
			System.out.println("username：" + username + " pwd："+ pwd);
			return new ModelAndView("loginSuccess", "message", "LoginSuccess "+username) ;
		}else{
			return new ModelAndView("error", "message", "LoginError "+username) ;
		}
	}
	
}
