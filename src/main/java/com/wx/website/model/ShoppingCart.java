package com.wx.website.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    private Integer userId;

    private String goodsId;

    private String goodsName;

    private Integer count;

    private Double price;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    List<OrderLine> items = new ArrayList<OrderLine>();  
    
    public List<OrderLine> getItems() {  
        return items;  
    }  
  
    public void setItems(List<OrderLine> items) {  
        this.items = items;  
    }  
      
    public void add(OrderLine order) {  
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

}