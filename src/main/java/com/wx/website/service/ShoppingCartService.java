package com.wx.website.service;


import com.wx.website.model.ShoppingCart;

public interface ShoppingCartService {
	
	ShoppingCart addCart();
	
	ShoppingCart selectById();
	
	int deleteCart();
	
	int updateCart();
}
