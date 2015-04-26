package com.wx.website.dao;

import com.wx.website.model.ShoppingCart;

public interface BaseShoppingCartMapper {
    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);
}