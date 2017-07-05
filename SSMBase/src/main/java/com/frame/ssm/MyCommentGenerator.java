/*
 * Copyright (c) 2015-2016 China CO-OP ELECTRONIC COMMERCE CO. LTD. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * China CO-OP ELECTRONIC COMMERCE CO. LTD. ("Confidential Information").
 * It may not be copied or reproduced in any manner without the express
 * written permission of China CO-OP ELECTRONIC COMMERCE CO. LTD.
 */

package com.frame.ssm;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * MyBatis 注释生成类.
 * @author FangSS 
 **/
public class MyCommentGenerator extends DefaultCommentGenerator {

	private static String fileComment = "/*\r\n"
			+ " * Copyright (c) 2015-2017 China CO-OP ELECTRONIC COMMERCE CO. LTD. All Rights Reserved.\r\n *\r\n"
			+ " * This software is the confidential and proprietary information of\r\n"
			+ " * China CO-OP ELECTRONIC COMMERCE CO. LTD. (\"Confidential Information\").\r\n"
			+ " * It may not be copied or reproduced in any manner without the express\r\n"
			+ " * written permission of China CO-OP ELECTRONIC COMMERCE CO. LTD.\r\n"
			+ " */\r\n";

	private static String AUTHOR = "${user}";

	private String encoding;

	public MyCommentGenerator() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addJavaFileComment(CompilationUnit compilationUnit) {
		// TODO Auto-generated method stub
		super.addJavaFileComment(compilationUnit);
		compilationUnit.addFileCommentLine(fileComment);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addComment(XmlElement xmlElement) {
		// TODO Auto-generated method stub
		super.addComment(xmlElement);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable table) {
		// TODO Auto-generated method stub
		innerClass.addJavaDocLine("/**");
		innerClass.addJavaDocLine(
				"* " + table.getTableConfiguration().getTableName() + ".");
		innerClass.addJavaDocLine("*");
		innerClass.addJavaDocLine("* @author " + AUTHOR);
		innerClass.addJavaDocLine("*");
		innerClass.addJavaDocLine("**/");

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void addClassComment(InnerClass innerClass,
			IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
		// TODO Auto-generated method stub
		this.addClassComment(innerClass, introspectedTable);
	}

	/**
	 * Gets the encoding.
	 * 
	 * @return Returns the encoding.
	 */
	public String getEncoding() {
		return this.encoding;
	}

	/**
	 * Sets the encoding.
	 * 
	 * @param encoding The encoding to set.
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

}
