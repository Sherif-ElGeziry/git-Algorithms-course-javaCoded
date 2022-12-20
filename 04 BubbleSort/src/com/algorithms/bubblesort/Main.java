package com.algorithms.bubblesort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Integer[] array = { 4, 435345, 345, 3, 2, 6, 69 };

		BubbleSort bub1 = new BubbleSort(array);

		// below two different ways of printing output
		Arrays.stream(bub1.bubbleSort()).forEach(System.out::println);
		System.out.println(Arrays.toString(bub1.bubbleSort()));
	}

}
