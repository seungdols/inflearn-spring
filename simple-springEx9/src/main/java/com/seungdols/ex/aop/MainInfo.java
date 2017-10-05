package com.seungdols.ex.aop;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.ex.aop
 * @AUTHOR seungdols
 * @DATE 2017. 10. 5.
 */
public class MainInfo {

	public static void main(String[] args) throws InterruptedException {

		GenericXmlApplicationContext context = new GenericXmlApplicationContext(
				"classpath:applicationCTX.xml");

		User user = context.getBean("user", User.class);
		user.getUserInfo();

		System.out.println("=================================");

		Company company = context.getBean("company", Company.class);
		company.getCompanyInfo();

	}

}
