package com.seungdols.ex.aop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @PACKAGE com.seungdols.ex.aop
 * @AUTHOR seungdols
 * @DATE 2017. 10. 5.
 */
public class MainInfo {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:application.xml");
		Student student = ctx.getBean("student", Student.class);
		student.getStudentInfo();

		Worker worker = ctx.getBean("worker", Worker.class);
		worker.getWorkerInfo();

		ctx.close();

	}

}
