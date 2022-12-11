package com.algorithms.recursionfactorial;

public class Factorial {

	public int FactorialUsingRecursion(int value) {
		if (value == 1) {
			return value;
		}

		return value * FactorialUsingRecursion(value - 1);
	}

	public int FactorialUsingIterative(int value) {
		int total = 1;

		for (int i = 2; i <= value; i++) {
			total *= i;
		}

		return total;
	}
}
