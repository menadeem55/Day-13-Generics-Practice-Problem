package com.generics.java;

public class GenericsMaxNumber<T> {
		T num1, num2, num3;
		public GenericsMaxNumber(T num1, T num2, T num3) {
			this.num1 = num1;
			this.num2 = num2;
			this.num3 = num3;
		}

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
