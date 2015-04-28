package com.wx.website.dao;

import com.wx.website.model.ShoppingCart;

public interface ShoppingCartMapper {
    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);
}