package com.test.jvm;

import java.util.Properties;

/**
 * 测试获取java虚拟机(JVM)的系统配置文件
 * @author FangSS
 */
public class RedJVMProperties {
	
	public static void main(String[] args) {
		Properties pros = System.getProperties();
		
		pros.list(System.out);
		
	}

}
