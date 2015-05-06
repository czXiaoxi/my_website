package com.wx.website.model;

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
    
   /* List<OrderLine> items = new ArrayList<CartItem>();  
    
    public List<CartItem> getItems() {  
        return items;  
    }  
  
    public void setItems(List<CartItem> items) {  
        this.items = items;  
    }  
      
    public void add(CartItem ci) {  
        for (Iterator<CartItem> iter = items.iterator(); iter.hasNext();) {  
            CartItem item = iter.next();  
            if(item.getProduct().getId() == ci.getProduct().getId()) {  
                item.setCount(item.getCount() + 1);  
                return;  
            }  
        }  
          
        items.add(ci);  
    }  
      
    public double getTotalPrice() {  
        double d = 0.0;  
        for(Iterator<CartItem> it = items.iterator(); it.hasNext(); ) {  
            CartItem current = it.next();  
            d += current.getProduct().getPrice() * current.getCount();  
        }  
        return d;  
    }  
      
    public void deleteItemById(String productId) {  
        for (Iterator<CartItem> iter = items.iterator(); iter.hasNext();) {  
            CartItem item = iter.next();  
            if(item.getProduct().getId().equals(productId)) {  
                iter.remove();  
                return;  
            }  
        }  
    }  */

}