package com.example.datastructure;

public class Sort {

	boolean isSorted (int [] sortList, int size) {
		//boolean flag = true;
		for (int i = 0; i<size-1; i++) {
			if (sortList [i] > sortList [i+1]) {
				return false;
			}
		}
		return true;
	}
}

class SelectionSort1 extends Sort {
	private int iMin;
	int [] nextIteration (int [] sortList, int index, int size) {
		iMin = index;
		for (int i = index + 1; i<size; i++) {
			if (sortList [i] < sortList [iMin]) {
				iMin = i;
			}
		}
		if (iMin != index) {
			int temp;
			temp = sortList [index];
			sortList [index] = sortList [iMin];
			sortList [iMin] = temp;
		}
		return sortList;
	}
}