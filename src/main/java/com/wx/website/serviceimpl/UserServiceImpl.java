package com.wx.website.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wx.website.model.User;
import com.wx.website.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	User user;
	
	public User addUser(int userId, String userName, String password,
			String address, String phoneNumber) {
		// TODO Auto-generated method stub
		user.setUserId(userId);
		user.setUserName(userName);
		user.setPassword(password);
		user.setAddress(address);
		user.setPhoneNumber(phoneNumber);
		
		return user;
	}

}
