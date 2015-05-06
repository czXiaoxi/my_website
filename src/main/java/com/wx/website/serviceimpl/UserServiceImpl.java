package com.wx.website.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wx.website.dao.UserMapper;
import com.wx.website.model.User;
import com.wx.website.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private User user;
	
	@Autowired
	private UserMapper userMapper;
	
	/*public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	public UserMapper getUserMapper(){
		return userMapper;
	}*/
	public User saveUser(int useId, String userName, String password,
			String address, String phoneNumber) {
		// TODO Auto-generated method stub
		user.setUserId(useId);
		user.setUserName(userName);
		user.setPassword(password);
		user.setAddress(address);
		user.setPhoneNumber(phoneNumber);
		userMapper.insert(user);
		return user;
	}
	public int deleteUser(int userId) {
		// TODO Auto-generated method stub
		 
		return userMapper.deleteByPrimaryKey(userId);
	}
	
	public int UpdateUser() {
		return 0;
	}
	
	public User selectByName(String userName) {
		
		return userMapper.selectByUserName(userName);
	}
	public User selectById(int userId) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(userId);
	}
	
	public User selectByuserId(int userId) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(userId);
		return user;
	}

	public boolean hasMatchUser(String userName, String password) {
        int matchCount = userMapper.getMatchCount(userName, password);
        return matchCount > 0;
    }
}
