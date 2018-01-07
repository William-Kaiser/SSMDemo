package com.lk1314.entity;

import com.lk1314.core.BaseEntity;

import java.util.List;

/**
 * @author likai
 */
public class Address extends BaseEntity {
    private Integer addrId;

    private String address;

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

