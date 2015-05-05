package com.wx.website.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping(value="/adduser", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("user") User user){
		userId = user.getUserId();
		userName = user.getUserName();
		password = user.getPassword();
		address = user.getPassword();
		phoneNumber = user.getPhoneNumber();
	    userServiceImpl.saveUser(userId,userName,password,address,phoneNumber);
	    return "success";
	}
	
	@RequestMapping(value="/deleteuser")
	public String delectUser(){
		userServiceImpl.deleteUser(5);
		return "success";
	}
	
	@RequestMapping(value="/selectuser")
	public User selectUser(){
		User user = userServiceImpl.selectById(userId);
		return user;
	}
	
	@RequestMapping(value="/updateuser")
	public int updateUser(){
		return 0;
	}
	
	@RequestMapping(value="/loginCheck")
	public ModelAndView loginCheck(HttpServletRequest request,User users){
		boolean isValidUser =
                userServiceImpl.hasMatchUser(users.getUserName(),
                		users.getPassword());
        if (!isValidUser) {
            return new ModelAndView("login", "error", "用户名或密码错误。");
        } else {
            User user = userServiceImpl.selectByName(users.getUserName());
            request.getSession().setAttribute("user",user);
            return new ModelAndView("success");
        }
	}
	
}
