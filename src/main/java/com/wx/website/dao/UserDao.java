package com.wx.website.dao;

import org.springframework.stereotype.Component;

import com.wx.website.mapping.BaseUserMapper;
import com.wx.website.model.User;

@Component
public class UserDao implements BaseUserMapper{
	
	public int updateByPrimaryKey(User record) {
		return 0;
	}

	public int deleteByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public User selectByPrimaryKey(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}
}
