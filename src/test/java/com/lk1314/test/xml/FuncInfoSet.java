package com.lk1314.test.xml;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @Author: william
 * @Date: 2018/4/17 14:35
 */
@XmlAccessorType(value= XmlAccessType.FIELD)  //访问类型改为字段
@XmlRootElement(name="root")
public class FuncInfoSet {

    @XmlElementWrapper(name = "can")
    @XmlElement(name="package")
    private List<PackageFactory> packageFactoryList;

    public List<PackageFactory> getPackageFactoryList() {
        return packageFactoryList;
    }

    public void setPackageFactoryList(List<PackageFactory> packageFactoryList) {
        this.packageFactoryList = packageFactoryList;
    }
}
