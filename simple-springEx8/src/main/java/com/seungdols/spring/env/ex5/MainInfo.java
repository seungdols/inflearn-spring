package com.seungdols.spring.env.ex5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @PACKAGE com.seungdols.spring.env.ex5
 * @AUTHOR seungdols
 * @DATE 2017. 10. 1.
 */
public class MainInfo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("dev");

		context.register(AnnotationConfig_Dev.class, AnnotationConfig_Real.class);
		context.refresh();

		ServerInfo serverInfo = context.getBean("serverInfo", ServerInfo.class);
		System.out.println("set profiles based on Annotation");
		System.out.println("server IP : " + serverInfo.getIp());
		System.out.println("server Port " + serverInfo.getPort());

		context.close();


	}

}
