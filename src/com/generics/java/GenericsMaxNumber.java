package com.generics.java;

public class GenericsMaxNumber {

	public static Float maximumFloat(Float num1, Float num2, Float num3) {

		Float max = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			max = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			max = num2;
		else
			max = num3;
		return max;
	}

	public static void main(String[] args) {

		System.out.println("Maximum Number Among 3 will be: " + maximumFloat(77.55f, 45.12f, 55.51f));

	}

}
