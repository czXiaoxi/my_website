package com.wx.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wx.website.model.User;
import com.wx.website.serviceimpl.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping(value="/adduser")
	public String addUser(){
		User user = userServiceImpl.saveUser(5, "test", "123456", "shanghai", "5555");
	    return "success";
	}
	
	@RequestMapping(value="/delectuser")
	public String delectUser(){
		userServiceImpl.delectUser(5);
		return "success";
	}
}
