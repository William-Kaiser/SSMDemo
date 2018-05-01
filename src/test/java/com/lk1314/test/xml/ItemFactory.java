package com.lk1314.test.xml;

import javax.xml.bind.annotation.*;

/**
 * @Author: william
 * @Date: 2018/4/17 14:37
 */
@XmlType(propOrder={"nameKey","name","type","hidden","endian","expression","field"}) //指定序列成的xml节点顺序
@XmlAccessorType(value= XmlAccessType.FIELD)  //访问类型改为字段
@XmlRootElement(name="item")
public class ItemFactory implements Comparable {

    @XmlTransient
    private String id;
    @XmlElement
    private String nameKey;
    @XmlElement
    private String name;
    @XmlElement
    private int type;
    @XmlElement
    private boolean hidden;
    @XmlElement
    private String endian;
    @XmlElement
    private String expression;
    @XmlElement
    private String field;//单位

    public String getId() {
        id = nameKey;
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
        this.id = nameKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getEndian() {
        return endian;
    }

    public void setEndian(String endian) {
        this.endian = endian;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int compareTo(Object o) {
        return 0;
    }
}
