package com.wx.website.service;

import com.wx.website.model.User;

public interface UserService {
	User saveUser(int useId,String userName,
			String password,String address,String phoneNumber);
	
	int deleteUser(int userId);
	
	User selectByName(String userName);
	
	int UpdateUser();
	
	User selectById(int userId);
	
	User selectByuserId(int userId);
}
