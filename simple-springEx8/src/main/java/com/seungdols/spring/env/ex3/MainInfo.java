package com.seungdols.spring.env.ex3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @PACKAGE com.seungdols.spring.env.ex3
 * @AUTHOR seungdols
 * @DATE 2017. 9. 30.
 */
public class MainInfo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfiguration.class);
		AdminConnection adminConnection = context.getBean("adminConfig", AdminConnection.class);

		System.out.println("set environment based on Annotation... ");
		System.out.println("Admin Id : " + adminConnection.getDbAdminId());
		System.out.println("Admin Pw : " + adminConnection.getDbAdminPw());

		context.close();

	}

}
