package com.wx.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class Loginpage {
	
	@RequestMapping(value = "/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/register")
	public String register(){
		return "register";
	}
	
	@RequestMapping(value="/shoppingcart")
	public String shoppingCart(){
		return "shoppingCart";
	}
	
	@RequestMapping(value="/checkorder")
	public String checkOrder(){
		return "checkorder";
	}
}
