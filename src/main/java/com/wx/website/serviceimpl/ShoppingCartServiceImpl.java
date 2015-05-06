package com.wx.website.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.wx.website.dao.ShoppingCartMapper;
import com.wx.website.model.ShoppingCart;
import com.wx.website.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired 
	private ShoppingCartMapper shoppingCartMapper;
	public String addOrder(@ModelAttribute("order")ShoppingCart order) {
		
		return "aa";
	}

	public ShoppingCart selectById() {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	public ShoppingCart addCart() {
		// TODO Auto-generated method stub
		return null;
	}

	public int deleteCart() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateCart() {
		// TODO Auto-generated method stub
		return 0;
	}

}
