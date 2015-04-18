package com.wx.website.mapping;

import com.wx.website.model.Estore;

public interface BaseEstoreMapper {
    int deleteByPrimaryKey(Integer goodsId);

    int insert(Estore record);

    int insertSelective(Estore record);

    Estore selectByPrimaryKey(Integer goodsId);

    int updateByPrimaryKeySelective(Estore record);

    int updateByPrimaryKey(Estore record);
}