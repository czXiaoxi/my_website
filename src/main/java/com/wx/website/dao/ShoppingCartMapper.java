package com.wx.website.dao;

import com.wx.website.model.ShoppingCart;

public interface ShoppingCartMapper {
	
    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);
    
    ShoppingCart selectByPrimaryKey(int goodsId);
    
    int deleteByPrimaryKey(int goodsId);
    
    int updateByPrimaryKey(int goodsId);
}