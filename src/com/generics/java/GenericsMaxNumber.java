package com.generics.java;

public class GenericsMaxNumber<T> {

	public static <T extends Comparable<T>> T maximumAmong3(T num1, T num2, T num3) {

		T max = num1;
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0)
			max = num1;
		else if (num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0)
			max = num2;
		else
			max = num3;
		return max;
	}

	public static void main(String[] args) {

		System.out.println("The max Number Among 3 String is: \n " + maximumAmong3("Mango", "Apple", "Banana"));
		System.out.println("The max Number Among 3 Integer number is : \n " + maximumAmong3(25, 38, 59));
		System.out.println("The max Number Among 3 Float number is: \n" + maximumAmong3(33.5, 29.44, 77.25));
	}

}
