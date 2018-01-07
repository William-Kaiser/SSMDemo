package com.lk1314.entity;

import com.lk1314.core.BaseEntity;

import java.util.List;

/**
 * @author likai
 */
public class Orders extends BaseEntity {

    private Integer orderId;

    private Integer userId;

    /**
     *   订单号
     */
    private String orderno;

    /**
     *  订单名称
     */
    private String orderName;

    private User user;

    private List<Orderdetail> orderdetails;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(List<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }
}