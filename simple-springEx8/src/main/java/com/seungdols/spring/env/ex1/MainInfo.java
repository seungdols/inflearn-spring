package com.seungdols.spring.env.ex1;

import java.io.IOException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

/**
 * @PACKAGE com.seungdols.spring.env.ex1
 * @AUTHOR seungdols
 * @DATE 2017. 9. 30.
 */
public class MainInfo {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new GenericXmlApplicationContext();
		ConfigurableEnvironment environment = context.getEnvironment();
		MutablePropertySources source = environment.getPropertySources();

		try {
			source.addLast(new ResourcePropertySource("classpath:admin.properties"));
			System.out.println(environment.getProperty("admin.id"));
			System.out.println(environment.getProperty("admin.pw"));

		} catch (IOException e) {
			e.printStackTrace();
		}

		GenericXmlApplicationContext genericXmlApplicationContext = (GenericXmlApplicationContext) context;
		genericXmlApplicationContext.load("applicationCTX1.xml");
		genericXmlApplicationContext.refresh();

		AdminConnection adminConnection = genericXmlApplicationContext
				.getBean("adminConnection", AdminConnection.class);

		System.out.println("admin ID : " + adminConnection.getDbAdminId() );
		System.out.println("admin PW : " + adminConnection.getDbAdminPw() );

		genericXmlApplicationContext.close();
		context.close();




	}

}
