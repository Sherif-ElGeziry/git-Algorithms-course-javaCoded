package com.algorithms.insertionsort;

public class Main {

	public static void main(String[] args) {
		Integer[] array = { 1, 8, 54, 9, 65, 1, 100, 0 };

		InsertionSort ins1 = new InsertionSort(array);

		System.out.println(ins1.insertionSort());
	}

}
