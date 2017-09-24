package com.seungdols.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.spring.ex
 * @AUTHOR seungdols
 * @DATE 2017. 9. 24.
 */
public class ExampleTest {

	public static void main(String[] args) {

		String contextPath = "classpath:applicationCTX.xml";
		AbstractApplicationContext applicationContext = new GenericXmlApplicationContext(contextPath);

		MyCalculator myCalculator = applicationContext.getBean("myCalculator", MyCalculator.class);

		myCalculator.add();
		myCalculator.sub();
		myCalculator.mul();
		myCalculator.div();

	}

}
