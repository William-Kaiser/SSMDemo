package com.lk1314.entity;

import com.lk1314.core.BaseEntity;

import java.util.List;

/**
 * @author likai
 */
public class User extends BaseEntity {
    private Integer userId;
    /**
     *   用户姓名
     */
    private String userName;
    /**
     *   密码
     */
    private String password;

    private List<Orders> ordersList;

    private Address address;

    /**
     *   一个用户具有多个角色
     */
    private List<Role> roleList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}

