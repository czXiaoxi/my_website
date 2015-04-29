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
	private Integer userId;
    private String userName;
    private String password;
    private String address;
    private String phoneNumber;
	
	@RequestMapping(value="/adduser" )
	public String addUser(){
	User user = userServiceImpl.saveUser(9,"userName", "password","address", "phoneNumber");
	    return "success";
	}
	
	@RequestMapping(value="/delectuser")
	public String delectUser(){
		userServiceImpl.delectUser(5);
		return "success";
	}
	
	@RequestMapping(value="/selectuser")
	public User selectUser(){
		User user = userServiceImpl.selectByuserId(3);
		return user;
	}
}
