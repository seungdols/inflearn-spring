package com.seungdols.spring.env.ex4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.spring.env.ex4
 * @AUTHOR seungdols
 * @DATE 2017. 10. 1.
 */
public class MainInfo {

	public static void main(String[] args) {

		String config = "dev";

		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.getEnvironment().setActiveProfiles(config);
		context.load("applicationCTX4_dev.xml", "applicationCTX4_real.xml");
		context.refresh();

		ServerInfo serverInfo = context.getBean("serverInfo", ServerInfo.class);
		System.out.println("Server IP : " + serverInfo.getIp());
		System.out.println("Server Port : " + serverInfo.getPort());

		context.close();

	}

}
