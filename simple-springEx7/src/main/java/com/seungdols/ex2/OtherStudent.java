package com.seungdols.ex2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @PACKAGE com.seungdols.ex2
 * @AUTHOR seungdols
 * @DATE 2017. 9. 29.
 */
public class OtherStudent {

	private String name;
	private int age;

	public OtherStudent() {
	}

	public OtherStudent(String name, int age) {
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

	@PostConstruct
	public void initMethod(){
		System.out.println("Init Method()");
	}

	@PreDestroy
	public void destroyMethod() {
		System.out.println("Destroy Method()");
	}
}
