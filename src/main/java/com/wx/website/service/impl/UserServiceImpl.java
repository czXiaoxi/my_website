package com.wx.website.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wx.website.dao.BaseUserMapper;
import com.wx.website.model.User;

@Component
public class UserServiceImpl implements BaseUserMapper{
	@Autowired
	private SqlSessionFactory sessionFactory;

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
		SqlSession session = sessionFactory.openSession();
		User user = session.selectOne("aa", userId);
		return user;
	}

	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
