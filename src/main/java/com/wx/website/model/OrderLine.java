package com.wx.website.model;

public class OrderLine {
    private Integer lineId;

    private Integer goodsId;

    private Integer count;
    
    private Estore estore;

    public Estore getEstore() {
		return estore;
	}

	public void setEstore(Estore estore) {
		this.estore = estore;
	}

	public Integer getLineId() {
        return lineId;
    }

    public void setLineId(Integer lineId) {
        this.lineId = lineId;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}