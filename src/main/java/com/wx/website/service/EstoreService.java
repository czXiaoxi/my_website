package com.wx.website.service;

import com.wx.website.model.Estore;

public interface EstoreService {
	
	Estore addGoods();
	
	Estore selectGoods();
	
	int updateGoods();
	
	int deleteGoods();
}
