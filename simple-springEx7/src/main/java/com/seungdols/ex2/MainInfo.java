package com.seungdols.ex2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.ex2
 * @AUTHOR seungdols
 * @DATE 2017. 9. 29.
 */
public class MainInfo {

	public static void main(String[] args) {
		final String contextPath = "classpath:applicationCTX.xml";

		GenericXmlApplicationContext context = new GenericXmlApplicationContext();

		context.load(contextPath);
		context.refresh();

		context.close();
	}
}
