package com.seungdols.ex.aop;

import java.util.concurrent.TimeUnit;

/**
 * @PACKAGE com.seungdols.ex.aop
 * @AUTHOR seungdols
 * @DATE 2017. 10. 5.
 */
public class Company {

	private String brand;
	private Integer count_branch;

	public Company() {
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Integer getCount_branch() {
		return count_branch;
	}

	public void setCount_branch(Integer count_branch) {
		this.count_branch = count_branch;
	}

	public void getCompanyInfo() throws InterruptedException {
		System.out.println("company brand is " + brand + ".");
		System.out.println("branch of company is " + count_branch + ".");
		//		비즈니스 로직이 너무 빨라서 시간 확인을 위해 추가
		TimeUnit.SECONDS.sleep(1);
	}
}
