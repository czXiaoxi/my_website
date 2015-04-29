package com.wx.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wx.website.model.ShoppingCart;

@Controller
@RequestMapping(value="/cart")
public class ShoppingCartAction {

	@Autowired
	private ShoppingCart shoppingCart;
	
	@RequestMapping(value="/addCart")
	public void addCart(){
		
	}
	
	@RequestMapping(value="/deleteCart")
	public void delectCart(){
		
	}
	
	@RequestMapping(value="/updateCart")
	public void updateCart(){
		
	}
	
	@RequestMapping(value="/selectCart")
	public ShoppingCart selectCart(){
		return shoppingCart;
	}
}
