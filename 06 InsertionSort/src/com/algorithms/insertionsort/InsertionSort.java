package com.algorithms.insertionsort;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort {

	private ArrayList<Integer> insSort;

	public InsertionSort(Integer[] array) {
		insSort = new ArrayList<>(Arrays.asList(array));
	}

	public ArrayList<Integer> insertionSort() {
		int length = insSort.size() - 1;

		for (int i = 0; i < length; i++) {
			int temp = insSort.get(i + 1);
			if (insSort.get(i) > insSort.get(i + 1)) {
				int ins = 0;
				for (int j = i - 1; j >= 0; j--) {
					if (insSort.get(j) < insSort.get(i + 1)) {
						ins = j + 1;
						break;
					}
				}
				insSort.remove(i + 1);
				insSort.add(ins, temp);
			}
		}

		return insSort;
	}
}
