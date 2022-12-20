package com.algorithms.selectionsort;

public class SelectionSort {

	private Integer[] selSort;

	public SelectionSort(Integer[] array) {
		selSort = array;
	}

	public Integer[] bubbleSort() {
		int length = selSort.length;

		for (int i = 0; i < length; i++) {
			int min = i;
			int selection = selSort[i];

			for (int j = i + 1; j < length; j++) {
				if (selSort[min] > selSort[j]) {
					min = j;
				}
			}

			selSort[i] = selSort[min];
			selSort[min] = selection;
		}
		return selSort;
	}
}
