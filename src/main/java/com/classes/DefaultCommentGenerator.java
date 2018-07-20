package com.classes;

import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.XmlElement;
/**
 *姝ゆ柟娉曚笓闂ㄧ敤鏉ョ敓鎴愭垜鎵�闇�瑕佺殑涓撶敤鏁版嵁搴撲腑鏂囨敞瑙�  
 *鍓嶆彁锛� 鏁版嵁搴撻噷蹇呴』瑕佹湁娉ㄨВ 
 * @author 榛勫嚡
 *
 */
public class DefaultCommentGenerator implements CommentGenerator {

	public void addClassComment(InnerClass arg0, IntrospectedTable arg1) {
		

	}

	public void addClassComment(InnerClass arg0, IntrospectedTable arg1, boolean arg2) {
		

	}

	public void addComment(XmlElement arg0) {
		

	}

	public void addConfigurationProperties(Properties arg0) {
	

	}

	public void addEnumComment(InnerEnum arg0, IntrospectedTable arg1) {
		
	}

	public void addFieldComment(Field arg0, IntrospectedTable arg1) {
		

	}

	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
		 if(introspectedColumn.getRemarks() != null) {
	            field.addJavaDocLine("/** " + introspectedColumn.getRemarks() + "*/");
	        }

	}

	public void addGeneralMethodComment(Method arg0, IntrospectedTable arg1) {
		

	}

	public void addGetterComment(Method arg0, IntrospectedTable arg1, IntrospectedColumn arg2) {
		

	}

	public void addJavaFileComment(CompilationUnit arg0) {
		

	}

	public void addRootComment(XmlElement arg0) {
		
	}

	public void addSetterComment(Method arg0, IntrospectedTable arg1, IntrospectedColumn arg2) {
		

	}

}
