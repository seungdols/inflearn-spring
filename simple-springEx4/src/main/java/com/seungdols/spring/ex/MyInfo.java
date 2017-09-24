package com.seungdols.spring.ex;

import java.util.List;

/**
 * @PACKAGE com.seungdols.spring.ex
 * @AUTHOR seungdols
 * @DATE 2017. 9. 24.
 */
public class MyInfo {

	private String name;
	private double height;
	private double weight;
	private List<String> hobbys;
	private BMICalculator bmiCalculator;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public List<String> getHobbys() {
		return hobbys;
	}

	public void setHobbys(List<String> hobbys) {
		this.hobbys = hobbys;
	}

	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}

	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	public void getInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Height : " + this.height);
		System.out.println("Weight : " + this.weight);
		System.out.println("Hobbys : " + hobbys);
		bmiCalculation();
	}

	public void bmiCalculation() {
		bmiCalculator.bmicalculation(weight, height);
	}
}