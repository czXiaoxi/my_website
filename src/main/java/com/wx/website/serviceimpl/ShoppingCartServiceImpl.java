package com.wx.website.serviceimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wx.website.dao.ShoppingCartMapper;
import com.wx.website.model.OrderLine;
import com.wx.website.model.ShoppingCart;
import com.wx.website.service.ShoppingCartService;

@Service
@RequestMapping(value = "/cart")
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired 
	private ShoppingCartMapper shoppingCartMapper;

	public ShoppingCart selectById() {
		// TODO Auto-generated method stub
		return null;
	}

	public ShoppingCart addCart() {
		
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
	
	List<OrderLine> items = new ArrayList<OrderLine>();  
    
    public List<OrderLine> getItems() {  
        return items;  
    }  
  
    public void setItems(List<OrderLine> items) {  
        this.items = items;  
    }  
    
    @RequestMapping(value="/shoppingcart")
    //判断新添加的商品是否在购物车中已经存在，存在count+1，不存在新添加一个订单
    public void addOrder(OrderLine order) {  
    	//遍历items（多个orderline）
        for (Iterator<OrderLine> iter = items.iterator(); iter.hasNext();) {  
        	OrderLine item = iter.next();  
            if(item.getEstore().getGoodsId() == order.getEstore().getGoodsId()) {  
                item.setCount(item.getCount() + 1);  
                return;  
            }  
        }  
          
        items.add(order);  
    }  
      
    public double getTotalPrice() {  
        double d = 0.0;  
        for(Iterator<OrderLine> it = items.iterator(); it.hasNext(); ) {  
        	OrderLine current = it.next();  
            d += current.getEstore().getPrice() * current.getCount();  
        }  
        return d;  
    }  
      
    public void deleteItemById(String goodsId) {  
        for (Iterator<OrderLine> iter = items.iterator(); iter.hasNext();) {  
        	OrderLine item = iter.next();  
            if(item.getEstore().getGoodsId().equals(goodsId)) {  
                iter.remove();  
                return;  
            }  
        }  
    } 
    
    public void clearCart(){
    	items.clear();
    }
}
