package com.chinasofti.onebox.onebox_web.domain;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userId;

    private Integer goodId;

    private Integer saleGoodQuantity;

    private Date createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getSaleGoodQuantity() {
        return saleGoodQuantity;
    }

    public void setSaleGoodQuantity(Integer saleGoodQuantity) {
        this.saleGoodQuantity = saleGoodQuantity;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}