package com.wx.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wx.website.model.Estore;

@Controller
@RequestMapping(value="/estore")
public class EstoreAction {
	
	@Autowired
	private Estore estore;
	
	@RequestMapping(value="/addgoods")
	public Estore addGoods(){
		return null;
	}
	
	@RequestMapping(value="/deletegoods")
	public void delectGood(){
		
	}
	
	@RequestMapping(value="/updategoods")
	public int updateGood(){
		return 0;
	}
	
	@RequestMapping(value="/selectgoods")
	public Estore selectGoods(){
		return estore;
	}
}
