package com.seungdols.ex.aop;

import java.util.concurrent.TimeUnit;

/**
 * @PACKAGE com.seungdols.ex.aop
 * @AUTHOR seungdols
 * @DATE 2017. 10. 5.
 */
public class User {

	private String name;
	private String id;
	private String nickName;

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void getUserInfo() throws InterruptedException {
		System.out.println("user name is " + name + ".");
		System.out.println("user id is " + id + ".");
		System.out.println("user nick name is " + nickName + ".");
		//		비즈니스 로직이 너무 빨라서 시간 확인을 위해 추가
		TimeUnit.SECONDS.sleep(1);
	}
}
