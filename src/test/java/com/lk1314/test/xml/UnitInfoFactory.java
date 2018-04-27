package com.lk1314.test.xml;

import javax.xml.bind.annotation.*;

/**
 * @Author: william
 * @Date: 2018/4/17 14:37
 */
@XmlType(propOrder={"UnitLevel","UnitName","UnitCode","ParentUnit","LinkMan","Tel","Address","Email"}) //指定序列成的xml节点顺序
@XmlAccessorType(value= XmlAccessType.FIELD)  //访问类型改为字段
@XmlRootElement(name="construction")
public class UnitInfoFactory implements Comparable {

    @XmlElement
    private String UnitLevel;
    @XmlElement
    private String UnitName;
    @XmlElement
    private String UnitCode;
    @XmlElement
    private String ParentUnit;
    @XmlElement
    private String LinkMan;
    @XmlElement
    private String Tel;
    @XmlElement
    private String Address;
    @XmlElement
    private String Email;//单位

    public String getUnitLevel() {
        return UnitLevel;
    }

    public void setUnitLevel(String unitLevel) {
        UnitLevel = unitLevel;
    }

    public String getUnitName() {
        return UnitName;
    }

    public void setUnitName(String unitName) {
        UnitName = unitName;
    }

    public String getUnitCode() {
        return UnitCode;
    }

    public void setUnitCode(String unitCode) {
        UnitCode = unitCode;
    }

    public String getParentUnit() {
        return ParentUnit;
    }

    public void setParentUnit(String parentUnit) {
        ParentUnit = parentUnit;
    }

    public String getLinkMan() {
        return LinkMan;
    }

    public void setLinkMan(String linkMan) {
        LinkMan = linkMan;
    }

    public String getTel() {
        return Tel;
    }

    public void setTel(String tel) {
        Tel = tel;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
