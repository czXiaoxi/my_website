package com.wx.website.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.wx.website.dao.IUserDao;
import com.wx.website.service.IUserService;
import com.wx.website.untity.User;

@Component("userService")
public class IUserServiceImpl implements IUserService {
	
  @Autowired
  private IUserDao userDao;
  @Override
  public User getUserById(int userId) {
    // TODO Auto-generated method stub
    return this.userDao.selectByPrimaryKey(userId);
  }
}
