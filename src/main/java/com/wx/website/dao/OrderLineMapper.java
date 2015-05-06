package com.wx.website.dao;

import com.wx.website.model.OrderLine;

public interface OrderLineMapper {
    int deleteByPrimaryKey(Integer lineId);

    int insert(OrderLine record);

    int insertSelective(OrderLine record);

    OrderLine selectByPrimaryKey(Integer lineId);

    int updateByPrimaryKeySelective(OrderLine record);

    int updateByPrimaryKey(OrderLine record);
}