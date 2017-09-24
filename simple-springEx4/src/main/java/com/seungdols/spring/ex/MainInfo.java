package com.seungdols.spring.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.spring.ex
 * @AUTHOR seungdols
 * @DATE 2017. 9. 24.
 */
public class MainInfo {

	public static void main(String[] args) {

		final String contextPath = "classpath:applicationCTX.xml";

		AbstractApplicationContext applicationContext = new GenericXmlApplicationContext(contextPath);
		MyInfo myInfo = applicationContext.getBean("myInfo", MyInfo.class);

		myInfo.getInfo();


	}

}
