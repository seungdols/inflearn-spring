package com.seungdols.ex2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @PACKAGE com.seungdols.ex2
 * @AUTHOR seungdols
 * @DATE 2017. 9. 29.
 */
public class Student implements InitializingBean, DisposableBean {

	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void destroy() throws Exception {
		System.out.println("Detroy() Bean");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}
}
