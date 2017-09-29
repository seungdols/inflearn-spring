package com.seungdols.ex1;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.spring
 * @AUTHOR seungdols
 * @DATE 2017. 9. 29.
 */
public class MainInfo {

	public static void main(String[] args) {
		final String contextPath = "classpath:applicationCTX.xml";

		//스프링 컨테이너 생성
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		//설정
		context.load(contextPath);

		context.refresh();

		// 사용
		Student student = context.getBean("student1", Student.class);
		System.out.println("Name: " + student.getName());
		System.out.println("Age : " + student.getAge());

		//종료
		context.close();


	}

}
