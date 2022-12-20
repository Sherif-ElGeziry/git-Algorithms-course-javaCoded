package com.algorithms.bubblesort;

public class BubbleSort {

	private Integer[] bubSort;

	public BubbleSort(Integer[] array) {
		bubSort = array;
	}

	public Integer[] bubbleSort() {
		int length = bubSort.length - 1;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i; j++) {
				if (bubSort[j] > bubSort[j + 1]) {
					int temp = bubSort[j + 1];
					bubSort[j + 1] = bubSort[j];
					bubSort[j] = temp;
				}
			}
		}
		return bubSort;
	}
}
