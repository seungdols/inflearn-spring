package com.seungdols.spring.env.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.spring.env.ex2
 * @AUTHOR seungdols
 * @DATE 2017. 9. 30.
 */
public class MainInfo {

	public static void main(String[] args) {

		AbstractApplicationContext context = new GenericXmlApplicationContext("classpath:applicationCTX2.xml");

		AdminConnection adminConnection = context.getBean("adminConnection", AdminConnection.class);

		System.out.println("admin ID: " + adminConnection.getDbAdminId());
		System.out.println("admin PW: " + adminConnection.getDbAdminPw());

		context.close();

	}

}
