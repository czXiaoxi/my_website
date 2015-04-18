package com.wx.website.mapping;

import com.wx.website.model.ShoppingCart;

public interface BaseShoppingCartMapper {
    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);
}