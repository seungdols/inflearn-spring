package com.seungdols.spring.ex;

/**
 * @PACKAGE com.seungdols.spring.ex
 * @AUTHOR seungdols
 * @DATE 2017. 9. 24.
 */
public class MyCalculator {

	private Calculator calculator;
	private int firstNumber;
	private int secondNumber;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}


	public void add() {
		calculator.addition(firstNumber, secondNumber);
	}
	public void sub() {
		calculator.subtraction(firstNumber, secondNumber);
	}
	public void mul() {
		calculator.multiplication(firstNumber, secondNumber);
	}
	public void div() {
		calculator.division(firstNumber, secondNumber);
	}

}
