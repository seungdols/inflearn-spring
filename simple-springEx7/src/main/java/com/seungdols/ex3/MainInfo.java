package com.seungdols.ex3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.ex3
 * @AUTHOR seungdols
 * @DATE 2017. 9. 29.
 */
public class MainInfo {

	public static void main(String[] args) {
		final String contextPath = "classpath:applicationCTX3.xml";

		AbstractApplicationContext context = new GenericXmlApplicationContext(contextPath);

		Student student1 = context.getBean("student", Student.class);
		System.out.println("Name : " + student1.getName());
		System.out.println("Age : " + student1.getAge());

//  결국 스프링 컨테이너는 범위(scope)를 singleton으로 지정하여 생성한다.

		Student student2 = context.getBean("student", Student.class);
		student2.setAge(37);
		System.out.println("Name : " + student2.getName());
		System.out.println("Age : " + student2.getAge());

		System.out.println("========= student1 ========");

		System.out.println("Name : " + student1.getName());
		System.out.println("Age : " + student1.getAge());

		context.close();
	}
}
