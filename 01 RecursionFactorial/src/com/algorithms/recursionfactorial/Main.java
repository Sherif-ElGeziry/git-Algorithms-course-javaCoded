package com.algorithms.recursionfactorial;

public class Main {

	public static void main(String[] args) {
		Factorial fac1 = new Factorial();

		System.out.println(fac1.FactorialUsingRecursion(5));
		System.out.println(fac1.FactorialUsingIterative(5));

		System.out.println(fac1.FactorialUsingRecursion(9));
		System.out.println(fac1.FactorialUsingIterative(9));

		System.out.println(fac1.FactorialUsingRecursion(2));
		System.out.println(fac1.FactorialUsingIterative(2));

		System.out.println(fac1.FactorialUsingRecursion(1));
		System.out.println(fac1.FactorialUsingIterative(1));
	}

}
