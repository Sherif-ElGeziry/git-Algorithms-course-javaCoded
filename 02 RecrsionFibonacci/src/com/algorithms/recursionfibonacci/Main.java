package com.algorithms.recursionfibonacci;

public class Main {

	public static void main(String[] args) {
		Fibonacci fib1 = new Fibonacci();

		System.out.print(fib1.FibonacciUsingRecursion(0) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(1) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(2) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(3) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(4) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(5) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(6) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(7) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(8) + ", ");
		System.out.print(fib1.FibonacciUsingRecursion(12));
		System.out.println();

		System.out.print(fib1.FibonacciUsingIterative(0) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(1) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(2) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(3) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(4) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(5) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(6) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(7) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(8) + ", ");
		System.out.print(fib1.FibonacciUsingIterative(12));
	}

}
