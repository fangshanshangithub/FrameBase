package com.test.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * 
 * java Properties测试类
 * @author FangSS
 */
public class PropertiesTest {
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		Properties pros = new Properties();
		try {
			//pros.load(new FileInputStream("src/test/java/com/test/properties/Test.properties")); // 读取同包下的Test.properties
			pros.load(new FileInputStream("src/test/resources/properties/Test1.properties")); // src/test/resource/properties中的Test1.properties
			
			Enumeration enum1 = pros.propertyNames();
			
			while (enum1.hasMoreElements()) {
				String key = (String) enum1.nextElement();
				String value = pros.getProperty(key);
				System.out.println(key + "------" + value);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

