package com.wx.website.service;

import com.wx.website.model.User;

public interface UserService {
	User addUser(int userId,String userName,String password,String address,String phoneNumber);
}
