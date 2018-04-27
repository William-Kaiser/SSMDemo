package com.lk1314.test.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @Author: william
 * @Date: 2018/4/17 14:35
 */
@XmlAccessorType(value= XmlAccessType.FIELD)  //访问类型改为字段
@XmlRootElement(name="data")
public class UnitInfoSet {

    @XmlElementWrapper(name = "body")
    @XmlElement(name="construction")
    private List<UnitInfoFactory> construction;

    public List<UnitInfoFactory> getConstruction() {
        return construction;
    }

    public void setConstruction(List<UnitInfoFactory> construction) {
        this.construction = construction;
    }
}
