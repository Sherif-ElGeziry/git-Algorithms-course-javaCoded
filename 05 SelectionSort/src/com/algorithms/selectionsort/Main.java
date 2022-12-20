package com.algorithms.selectionsort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Integer[] array = { 6, 2, 1, 5, 63, 87, 283, 4, 0 };

		SelectionSort sel1 = new SelectionSort(array);

		// below two different ways of printing output
		Arrays.stream(sel1.bubbleSort()).forEach(System.out::println);
		System.out.println(Arrays.toString(sel1.bubbleSort()));

	}

}
