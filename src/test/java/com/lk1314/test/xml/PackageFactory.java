package com.lk1314.test.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @Author: william
 * @Date: 2018/4/17 14:37
 */
@XmlType(propOrder={"id","length","itemFactoryList"}) //指定序列成的xml节点顺序
@XmlAccessorType(value= XmlAccessType.FIELD)  //访问类型改为字段
@XmlRootElement(name="package")
public class PackageFactory implements Comparable {

    @XmlAttribute
    private String id;
    @XmlAttribute
    private String length;

    @XmlElement(name="item")
    private List<ItemFactory> itemFactoryList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public List<ItemFactory> getItemFactoryList() {
        return itemFactoryList;
    }

    public void setItemFactoryList(List<ItemFactory> itemFactoryList) {
        this.itemFactoryList = itemFactoryList;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
