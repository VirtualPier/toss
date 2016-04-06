package com.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/register")
	public ModelAndView register(HttpServletRequest request,String username,String pwd){
		request.getSession().setAttribute("username", username);
		request.getSession().setAttribute("pwd", pwd);
		System.out.println("username：" + username + " pwd："+ pwd);
		return new ModelAndView("HelloWorld", "message", "Hello "+username+" your Pwd :"+pwd) ;
	}
	
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletRequest request,String username,String pwd){
		if(String.valueOf(request.getSession().getAttribute("username")).equals(username) && String.valueOf(request.getSession().getAttribute("pwd")).equals(pwd)){
			System.out.println("username：" + username + " pwd："+ pwd);
			return new ModelAndView("loginSuccess", "message", "LoginSuccess "+username) ;
		}else{
			return new ModelAndView("error", "message", "LoginSuccess "+username) ;
		}
		
	}
	
}
