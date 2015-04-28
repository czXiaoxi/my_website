package com.wx.website.dao;

import com.wx.website.model.Estore;

public interface EstoreMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Estore record);

    int insertSelective(Estore record);

    Estore selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Estore record);

    int updateByPrimaryKey(Estore record);
}