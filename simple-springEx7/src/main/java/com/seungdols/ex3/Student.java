package com.seungdols.ex3;

/**
 * @PACKAGE com.seungdols.ex3
 * @AUTHOR seungdols
 * @DATE 2017. 9. 29.
 */
public class Student {

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
}
