package com.algorithms.mergesort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

	private ArrayList<Integer> temp;

	public MergeSort(Integer[] array) {
		temp = new ArrayList<Integer>(Arrays.asList(array));
		mergeSort(temp);
	}

	public ArrayList<Integer> mergeSort(ArrayList<Integer> array) {
		if (temp.size() == 1) {
			return temp;
		}

		int halfArray = (temp.size() / 2);

		ArrayList<Integer> left = new ArrayList<Integer>();
		for (int i = 0; i < halfArray; i++) {
			left.add(temp.get(i));
		}

		ArrayList<Integer> right = new ArrayList<Integer>();
		for (int i = halfArray; i < temp.size(); i++) {
			right.add(temp.get(i));
		}

		return merging(mergeSort(left), mergeSort(right));

	}

	public ArrayList<Integer> merging(ArrayList<Integer> left, ArrayList<Integer> right) {
		ArrayList<Integer> combined = new ArrayList<Integer>();

		int loops = left.size() + right.size();
		for (int i = 0, j = 0, k = 0; i < loops; i++) {
			if (j < left.size() && k < right.size()) {
				if (left.get(j) <= right.get(k)) {
					combined.add(left.get(j));
					j++;
				} else {
					combined.add(right.get(k));
					k++;
				}
			} else if (j == left.size()) {
				combined.add(right.get(k));
				k++;
			} else {
				combined.add(left.get(j));
				j++;
			}
		}

		return combined;
	}
}
