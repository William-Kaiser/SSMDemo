package com.lk1314.test.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JavaTransfer {

	public static void main(String[] args) {

		File file = new File("D:\\file.xml");
		JAXBContext context = null;
		UnitInfoSet unitInfoSet = null;
		try {
			context = JAXBContext.newInstance(UnitInfoSet.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			unitInfoSet = (UnitInfoSet) unmarshaller.unmarshal(file);
			System.out.println("unitInfoSet="+unitInfoSet);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		File file = new File("D:\\徐工道路三阶段发动机功能机.xml");
//		JAXBContext context = null;
//		FuncInfoSet funcInfoSet = null;
//		try {
//			context = JAXBContext.newInstance(FuncInfoSet.class);
//			Unmarshaller unmarshaller = context.createUnmarshaller();
//			funcInfoSet = (FuncInfoSet) unmarshaller.unmarshal(file);
//			System.out.println("funcInfoSet="+funcInfoSet);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}


	}
}
