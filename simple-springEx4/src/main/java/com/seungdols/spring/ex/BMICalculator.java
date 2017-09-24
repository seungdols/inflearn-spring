package com.seungdols.spring.ex;

/**
 * @PACKAGE com.seungdols.spring.ex
 * @AUTHOR seungdols
 * @DATE 2017. 9. 24.
 */
public class BMICalculator {

	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;

	public void bmicalculation(double weight, double height) {

		double h = height * 0.01 ;
		double result = weight / (h*h);

		System.out.println("BMI 지수 : " + (int)result);

		if(result > obesity) {
			System.out.println("비만 입니다.");
		} else if(result > overWeight) {
			System.out.println("과체중 입니다.");
		}else if(result > normal) {
			System.out.println("정상 입니다.");
		}else {
			System.out.println("저체중 입니다.");
		}
	}

	public double getLowWeight() {
		return lowWeight;
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public double getNormal() {
		return normal;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public double getOverWeight() {
		return overWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public double getObesity() {
		return obesity;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
}
