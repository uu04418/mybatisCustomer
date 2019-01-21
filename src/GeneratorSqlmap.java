

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmap {
	

	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
	//File configFile = new File("generatorConfig.xml"); 
		File configFile = new File("simpletest2.xml");
		 ConfigurationParser cp = new ConfigurationParser(warnings);  
         Configuration config = cp.parseConfiguration(configFile);  
         DefaultShellCallback callback = new DefaultShellCallback(overwrite);  
         MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);  
         myBatisGenerator.generate(null);  

	} 
	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public class DefaultCommentGenerator implements CommentGenerator {
		    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
		        if(introspectedColumn.getRemarks() != null) {
		            field.addJavaDocLine("/** " + introspectedColumn.getRemarks() + "*/");
		        }
		    }

			@Override
			public void addClassComment(InnerClass arg0, IntrospectedTable arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addClassComment(InnerClass arg0, IntrospectedTable arg1, boolean arg2) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addComment(XmlElement arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addConfigurationProperties(Properties arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addEnumComment(InnerEnum arg0, IntrospectedTable arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addFieldComment(Field arg0, IntrospectedTable arg1) {
				// TODO Auto-generated method stub
				
			}


			@Override
			public void addGeneralMethodComment(Method arg0, IntrospectedTable arg1) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addGetterComment(Method arg0, IntrospectedTable arg1, IntrospectedColumn arg2) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addJavaFileComment(CompilationUnit arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addRootComment(XmlElement arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void addSetterComment(Method arg0, IntrospectedTable arg1, IntrospectedColumn arg2) {
				// TODO Auto-generated method stub
				
			}
		}

}
