package com.wx.website.dao;

import org.apache.ibatis.annotations.Param;

import com.wx.website.model.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByUserName(String userName);
    
    User selectByPrimaryKey(int userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	int getMatchCount(@Param("userName")String userName, @Param("password")String password);
}