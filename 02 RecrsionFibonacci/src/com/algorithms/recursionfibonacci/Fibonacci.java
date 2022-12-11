package com.algorithms.recursionfibonacci;

public class Fibonacci {

	public int FibonacciUsingRecursion(int value) {
		if (value < 2) {
			return value;
		}

		return FibonacciUsingRecursion(value - 1) + FibonacciUsingRecursion(value - 2);
	}

	public int FibonacciUsingIterative(int value) {
		if (value == 0) {
			return 0;
		} else if (value <= 2) {
			return 1;
		}

		int val1 = 0;
		int val2 = 1;
		int total = 1;

		for (int i = 3; i <= value; i++) {
			val1 = total;
			total = total + val2;
			val2 = val1;
		}

		return total;
	}
}
